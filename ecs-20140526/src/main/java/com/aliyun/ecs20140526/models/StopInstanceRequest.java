// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    /**
     * <p>This parameter will be removed in the future and is retained only to ensure compatibility. We recommend that you ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfirmStop")
    public Boolean confirmStop;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and available ECS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false: performs a dry run and performs the actual request.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully stop the ECS instance. Valid values:</p>
     * <ul>
     * <li>true: forcefully stops the ECS instance. If you set ForceStop to true, this operation is equivalent to a power-off operation. Cache data that is not written to storage devices on the instance is lost.</li>
     * <li>false: normally stops the ECS instance.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <blockquote>
     * <p>This parameter is in invitational preview and is not publicly available.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("Hibernate")
    public Boolean hibernate;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4ph****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The stop mode of the pay-as-you-go instance. Valid values:</p>
     * <ul>
     * <li><p>StopCharging: economical mode. After an instance is stopped in economical mode:</p>
     * <ul>
     * <li>Billing for the following resources of the instance stops: computing resources (vCPUs, memory, and GPUs), image licenses, and public bandwidth of the static public IP address (if any) that uses the pay-by-bandwidth metering method.</li>
     * <li>Billing for the following resources of the instance continues: system disk, data disks, and public bandwidth of the elastic IP address (EIP) (if any) that uses the pay-by-bandwidth metering method.</li>
     * <li>The instance may fail to restart due to the reclaimed computing resources or insufficient resources. Try again later or change the instance type of the instance.</li>
     * <li>If an EIP is associated with the instance before the instance is stopped, the EIP remains unchanged after the instance is restarted. If a static public IP address is associated with the instance before the instance is stopped, the static public IP address may change, but the private IP address does not change.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
     * <p>**</p>
     * <p><strong>Note</strong> If the instance does not support the economical mode, the system stops the instance and does not report errors during the operation call. The following types of instances are not supported: classic network instances, local disks, and monthly instances.</p>
     * </li>
     * <li><p>KeepCharging: standard mode. After the instance is stopped in standard mode, you continue to be charged for the instance.</p>
     * </li>
     * </ul>
     * <p>Default value: If the conditions for <a href="~~63353#default~~">enabling the economical mode for an instance in a VPC</a> are met and you have enabled this mode in the ECS console, the default value is <code>StopCharging</code>. Otherwise, the default value is <code>KeepCharging</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>KeepCharging</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    public static StopInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceRequest self = new StopInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopInstanceRequest setConfirmStop(Boolean confirmStop) {
        this.confirmStop = confirmStop;
        return this;
    }
    public Boolean getConfirmStop() {
        return this.confirmStop;
    }

    public StopInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StopInstanceRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public StopInstanceRequest setHibernate(Boolean hibernate) {
        this.hibernate = hibernate;
        return this;
    }
    public Boolean getHibernate() {
        return this.hibernate;
    }

    public StopInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StopInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StopInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StopInstanceRequest setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

}
