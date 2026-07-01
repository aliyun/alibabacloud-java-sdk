// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesRequest extends TeaModel {
    /**
     * <p>The batch operation mode. Valid values:</p>
     * <ul>
     * <li><p>AllTogether: All operations must succeed for the entire batch operation to be considered successful. If any operation fails, the entire batch operation fails and all completed operations are rolled back to the previous state.</p>
     * </li>
     * <li><p>SuccessFirst: Each operation in the batch is executed independently. If an operation fails, other operations can still be executed and confirmed as successful. Successful operations are committed, and failed operations are marked as failed without affecting the results of other operations.</p>
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
     * <li><p>true: sends a dry run request without stopping the instances. The system checks the required parameters, request format, and instance status. If the check fails, the corresponding error is returned. If the check succeeds, <code>DRYRUN.SUCCESS</code> is returned.</p>
     * <blockquote>
     * <p>If the BatchOptimization parameter is set to <code>SuccessFirst</code>, the dry run result for <code>DryRun=true</code> returns only <code>DRYRUN.SUCCESS</code>.</p>
     * </blockquote>
     * </li>
     * <li><p>false: sends a normal request. After the request passes the check, the instances are stopped.</p>
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
     * <p>Specifies whether to forcefully stop the instances. Valid values:</p>
     * <ul>
     * <li>true: forcefully stops the instances.<blockquote>
     * <p>Warning: A forced stop is equivalent to a power-off. Data that is not written to disks in the instance operating system may be lost. Proceed with caution.</p>
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
     * <p>The region ID of the instances. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
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
     * <li><p>StopCharging: economical mode. After economical mode is enabled:</p>
     * <ul>
     * <li>Billing for compute resources (vCPUs, memory, and GPUs), image license fees, and fixed bandwidth of static public IP addresses is suspended.</li>
     * <li>Billing for system disks, data disks, and fixed bandwidth of Elastic IP Addresses (EIPs) continues.</li>
     * <li>Because compute resources are released, the instance may fail to start due to insufficient resources. Try again later or change the instance type.</li>
     * <li>If an EIP is associated with the instance before it is stopped, the IP address remains unchanged after the instance is restarted. Otherwise, the static public IP address may change, but the private IP address remains unchanged.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
     * <blockquote>
     * <p>Notice:</p>
     * </blockquote>
     * </li>
     * </ul>
     * <p>If the instance does not support economical mode, the API does not return an error. Stopping the instance takes priority. Instance types that do not support economical mode include instances with local SSDs and subscription instances.</p>
     * <ul>
     * <li>KeepCharging: standard stop mode. After the instance is stopped, resources are retained and billing continues. The instance type inventory and public IP address are also retained. If you stop the instance to replace the operating system, reinitialize a disk, change the instance type, or modify the private IP address, select this mode to avoid startup failures.</li>
     * </ul>
     * <p>Default value: If you <a href="~~63353#default~~">enable economical mode for VPC-connected instances</a> and the conditions are met, the default value is <code>StopCharging</code>. Otherwise, the default value is <code>KeepCharging</code>.</p>
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
