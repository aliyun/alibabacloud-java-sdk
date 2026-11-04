// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesRequest extends TeaModel {
    /**
     * <p>The batch operation mode. Valid values:</p>
     * <ul>
     * <li><p>AllTogether: all operations must succeed for the entire batch operation to be considered successful. If any operation fails, the entire batch operation is considered failed, and all executed operations are rolled back to their original state.</p>
     * </li>
     * <li><p>SuccessFirst: each operation in the batch is executed independently. If an operation fails, other operations can still continue and succeed. In this mode, successful operations are committed, and failed operations are marked as failed without affecting the results of other operations.</p>
     * </li>
     * </ul>
     * <p>Default value: AllTogether.</p>
     * 
     * <strong>example:</strong>
     * <p>AllTogether</p>
     */
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    /**
     * <p>Specifies whether to send a dry run request. Valid values:</p>
     * <ul>
     * <li><p>true: sends a dry run request without stopping the instances. The system checks whether required parameters are specified, the request format is valid, and the instance status is valid. If the request fails the check, an error is returned. If the request passes the check, <code>DRYRUN.SUCCESS</code> is returned.</p>
     * <blockquote>
     * <p>If the <code>BatchOptimization</code> parameter is set to <code>SuccessFirst</code>, the dry run result for <code>DryRun=true</code> only returns <code>DRYRUN.SUCCESS</code>.</p>
     * </blockquote>
     * </li>
     * <li><p>false: sends a regular request and stops the instances directly after the request passes the check.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to force stop the instances. Valid values:</p>
     * <ul>
     * <li>true: force stops the instances.<blockquote>
     * <p>Warning: Force stopping an instance is equivalent to a power outage and may cause data in the operating system that is not written to the disk to be lost. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * <li>false: normally stops the instances.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>The instance IDs. Array length: 1 to 100.</p>
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
     * <p>The stop mode. Valid values:</p>
     * <ul>
     * <li><p>StopCharging: economical mode. After you enable economical mode:</p>
     * <ul>
     * <li>Billing is suspended for computing resources (vCPUs, memory, and GPUs), image licenses, and static public IP addresses that use the pay-by-bandwidth billing method.</li>
     * <li>Billing continues for system cloud disks, data cloud disks, and Elastic IP Addresses (EIPs) that use the pay-by-bandwidth billing method.</li>
     * <li>Because computing resources are released, the instance may fail to start due to insufficient resource inventory. If this occurs, try again later or change the instance type.</li>
     * <li>If an EIP was associated with the instance before it was stopped, the IP address remains unchanged after the instance is restarted. Otherwise, the static public IP address may change, but the private IP address remains unchanged.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
     * <blockquote>
     * <p>Notice:</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>If the instance does not support economical mode, the API does not return an error and prioritizes stopping the instance. Instance types that do not support economical mode include instances with local disks and subscription instances.</p>
     * <ul>
     * <li>KeepCharging: standard stop mode. After the instance is stopped, its resources are retained and continue to be billed. The ECS instance type inventory and public IP address are also reserved for you. Select this mode if you stop the instance to perform operations such as replacing the operating system, reinitializing cloud disks, changing the instance type, or modifying the private IP address. This prevents startup failures.</li>
     * </ul>
     * <p>Default value: If you <a href="~~63353#default~~">enable economical mode for instances in a VPC</a> and the instance meets the requirements, the default value is <code>StopCharging</code>. Otherwise, the default value is <code>KeepCharging</code>.</p>
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
