// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    /**
     * <p>This parameter will be deprecated soon and is retained only for compatibility purposes. Ignore this parameter when you call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfirmStop")
    public Boolean confirmStop;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The instance is not stopped. The system checks whether required parameters are specified, whether the request format is valid, whether business restrictions are met, and whether ECS inventory is sufficient. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li>false: performs a dry run and sends the request. The instance is stopped after the check succeeds.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully stop the instance. Valid values:</p>
     * <ul>
     * <li>true: forcefully stops the instance. This is equivalent to a power-off operation. All cached data that is not written to storage devices is lost.</li>
     * <li>false: normally stops the instance.</li>
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
     * <p>This parameter is in invitational preview and is not available for use.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>hide</p>
     */
    @NameInMap("Hibernate")
    public Boolean hibernate;

    /**
     * <p>The instance ID.</p>
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
     * <p>The stop mode for the pay-as-you-go ECS instance. Valid values:</p>
     * <ul>
     * <li><p>StopCharging: economical mode. After the economical mode is enabled:</p>
     * <ul>
     * <li>Billing is suspended for compute resources (vCPUs, memory, and GPUs), image license fees, and fixed bandwidth of static public IP addresses.</li>
     * <li>Billing continues for system disks, data disks, and fixed bandwidth of Elastic IP Addresses (EIPs).</li>
     * <li>Because compute resources are released, the instance may fail to restart due to insufficient inventory. Try again later or change the instance type.</li>
     * <li>If the instance is associated with an EIP before it is stopped, the IP address remains unchanged after the instance is restarted. Otherwise, the static public IP address may change, but the private IP address remains unchanged.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
     * <blockquote>
     * <p>Notice:</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>If the instance does not support the economical mode, no error is returned on the API side. Stopping the instance takes priority. Instance types that do not support the economical mode include instances with local disks and subscription instances.</p>
     * <ul>
     * <li>KeepCharging: standard stop mode. The instance continues to be billed after it is stopped.</li>
     * </ul>
     * <p>Default value: If you enable the economical mode for VPC-connected instances in the ECS console (for more information, see <a href="~~63353#default~~">Enable the economical mode by default</a>) and the conditions are met, the default value is <code>StopCharging</code>. Otherwise, the default value is <code>KeepCharging</code>.</p>
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
