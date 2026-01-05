// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesRequest extends TeaModel {
    /**
     * <p>Specifies the batch operation mode. Valid values:</p>
     * <ul>
     * <li>AllTogether: The batch operation is successful only after all operations are successful. If any operation fails, the batch operation is considered failed, and all operations that have been performed are undone to restore the instances to the status before the batch operation.</li>
     * <li>SuccessFirst: allows each operation in a batch to be independently executed. If an operation fails, other operations can continue and confirm success. In this mode, successful operations are committed and failed operations are marked as failed, but the execution results of other operations are not affected.</li>
     * </ul>
     * <p>Default value: AllTogether.</p>
     * 
     * <strong>example:</strong>
     * <p>AllTogether</p>
     */
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    /**
     * <p>Specifies whether to send a precheck request. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and instance status. If the check fails, the corresponding error message is returned. If the request passes the dry run, <code>DRYRUN.SUCCESS</code> is returned.</li>
     * </ul>
     * <blockquote>
     * <p> If you set <code>BatchOptimization</code> to <code>SuccessFirst</code> and <code>DryRun</code> to true, only <code>DRYRUN.SUCCESS</code> is returned, regardless of whether the request passes the dry run.</p>
     * </blockquote>
     * <ul>
     * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, instances are stopped.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to forcefully stop instances. Valid values:</p>
     * <ul>
     * <li><p>true: forcefully stops the ECS instance.</p>
     * <p>**</p>
     * <p><strong>Alert</strong> Force Stop: forcefully stops the instance. A force stop is equivalent to a physical shutdown and may cause data loss if instance data has not been written to disks.</p>
     * </li>
     * <li><p>false: normally stops the ECS instance.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>The IDs of ECS instances. You can specify 1 to 100 instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Stop mode. Valid values:</p>
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
     * <p><strong>Note</strong> If the instance itself does not support the economical shutdown mode, the API side does not intercept errors, and the instance is preferentially stopped. The following types of instances are not supported: classic network instances, local disks, and monthly instances.</p>
     * </li>
     * <li><p>KeepCharging: standard mode. After the instance is stopped in standard mode, you continue to be charged for the instance. If you want to change the operating system, re-initialize disks, change the instance type, or modify the private IP address, we recommend selecting this mode to avoid startup failures.</p>
     * </li>
     * </ul>
     * <p>Default value: If the conditions for <a href="~~63353#default~~">enabling the economical mode for an instance in a VPC</a> are met and you have enabled this mode in the ECS console, the default value is <code>StopCharging</code>. Otherwise, the default value is <code>KeepCharging</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>KeepCharging</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    public static StopInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesRequest self = new StopInstancesRequest();
        return TeaModel.build(map, self);
    }

    public StopInstancesRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public StopInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StopInstancesRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop;
        return this;
    }
    public Boolean getForceStop() {
        return this.forceStop;
    }

    public StopInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public StopInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StopInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StopInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StopInstancesRequest setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

}
