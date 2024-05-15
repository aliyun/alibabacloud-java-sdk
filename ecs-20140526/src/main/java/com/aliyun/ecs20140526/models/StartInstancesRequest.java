// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstancesRequest extends TeaModel {
    /**
     * <p>The IDs of the ECS instances. You can specify up to 100 ECS instance IDs.</p>
     */
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    /**
     * <p>The region ID of the ECS instance. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of instance N. Valid values of N: 1 to 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public java.util.List<String> instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The batch operation mode. Valid values:</p>
     * <br>
     * <p>*   AllTogether: starts all ECS instances at the same time. If all ECS instances are started, a success message is returned. If an ECS instance fails to be started, all the specified instances fail to be started and an error message is returned.</p>
     * <p>*   SuccessFirst: separately starts each ECS instance. The response contains the operation results of each ECS instance.</p>
     * <br>
     * <p>Default value: AllTogether.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static StartInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesRequest self = new StartInstancesRequest();
        return TeaModel.build(map, self);
    }

    public StartInstancesRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public StartInstancesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public StartInstancesRequest setInstanceId(java.util.List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    public StartInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StartInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
