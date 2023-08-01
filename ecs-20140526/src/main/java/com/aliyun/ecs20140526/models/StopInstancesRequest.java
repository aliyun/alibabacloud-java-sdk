// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of instances.</p>
     */
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The stop mode of the pay-as-you-go instance. Valid values:</p>
     * <br>
     * <p>*   StopCharging: economical mode. For information about the conditions on which `StopCharging` takes effect, see the "Conditions for enabling economical mode" section in [Economical mode](~~63353~~).</p>
     * <p>*   KeepCharging: standard mode. You continue to be charged for instances that are stopped in standard mode.</p>
     * <br>
     * <p>Default value: If the conditions for enabling the economical mode are met and you have enabled this mode in the ECS console, the default value is [StopCharging](~~63353#default~~). For more information, see the "Enable economical mode" section in `Economical mode`. Otherwise, the default value is `KeepCharging`.</p>
     */
    @NameInMap("ForceStop")
    public Boolean forceStop;

    /**
     * <p>The ID of instance N. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to forcibly stop the instance. Valid values:</p>
     * <br>
     * <p>*   true: forcibly stops the instance. This operation is equivalent to the power-off operation in common scenarios. Cache data that is not written to storage devices on the instance is lost.</p>
     * <p>*   false: normally stops the instance.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies the batch operation mode. Valid values:</p>
     * <br>
     * <p>*   AllTogether: In this mode, a success message is returned if all specified instances are stopped. If one or more of the specified instances fail the check when you set the DryRun parameter to false, none of the specified instances can be stopped and an error message is returned.</p>
     * <p>*   SuccessFirst: In this mode, each instance is separately stopped. The response contains the operation results for each instance.</p>
     * <br>
     * <p>Default value: AllTogether.</p>
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
