// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesRequest extends TeaModel {
    // The batch operation mode. Valid values:
    // 
    // *   AllTogether: In this mode, if all instances are stopped, a success message is returned. If an instance fails the verification, all instances fail to stop and an error message is returned.
    // *   SuccessFirst: In this mode, each instance is separately stopped. The response contains the operation results for each instance.
    // 
    // Default value: AllTogether.
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    // Specifies whether to check the validity of the request without actually making the request. Valid values:
    // 
    // *   true: The validity of the request is checked, but the request is not made. Check items include the request format, instance status, and whether the required parameters are specified. If the check fails, the corresponding error message is returned. If the check succeeds, `DRYRUN.SUCCESS` is returned.
    // 
    //     > If you set `BatchOptimization` to `SuccessFirst` and `DryRun` to true, only `DRYRUN.SUCCESS` is returned regardless of whether the check succeeds.
    // 
    // *   false: The validity of the request is checked, and the request is made if the check succeeds.
    // 
    // Default value: false.
    @NameInMap("DryRun")
    public Boolean dryRun;

    // Specifies whether to forcibly stop the instance. Valid values:
    // 
    // *   true: forcibly stops the instance. This operation is equivalent to the typical power-off operation. Cache data that is not written to storage in the instance will be lost.
    // *   false: normally stops the instance.
    // 
    // Default value: false.
    @NameInMap("ForceStop")
    public Boolean forceStop;

    // The list of instance ID.
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The stop mode of the pay-as-you-go instance. Valid values:
    // 
    // *   StopCharging: economical mode. For information about how `StopCharging` takes effect, see the "Prerequisites" section in [Economical mode](~~63353~~).
    // *   KeepCharging: standard mode. After the instances are stopped in standard mode, you continue to be charged for them.
    // 
    // Default value: If the prerequisites required for enabling the economical mode are met and you have enabled this mode in the ECS console, the default value is `StopCharging`. For more information, see "Enable the economical mode" in [Economical mode](~~63353#default~~). Otherwise, the default value is `KeepCharging`.
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
