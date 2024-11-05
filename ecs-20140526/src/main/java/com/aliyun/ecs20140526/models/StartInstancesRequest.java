// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstancesRequest extends TeaModel {
    /**
     * <p>The batch operation mode. Valid values:</p>
     * <ul>
     * <li>AllTogether: starts all ECS instances at the same time. If all ECS instances are started, a success message is returned. If an ECS instance fails to be started, all the specified instances fail to be started and an error message is returned.</li>
     * <li>SuccessFirst: separately starts each ECS instance. The response contains the operation results of each ECS instance.</li>
     * </ul>
     * <p>Default value: AllTogether.</p>
     * 
     * <strong>example:</strong>
     * <p>AllTogether</p>
     */
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li>true: performs only a dry run. The system checks the request for potential issues, including required parameters, request syntax, and instance status. If the request fails the dry run, an error message is returned. If the request passes the dry run, <code>DRYRUN.SUCCESS</code> is returned.</li>
     * </ul>
     * <blockquote>
     * <p>If you set <code>BatchOptimization</code> to <code>SuccessFirst</code> and <code>DryRun</code> to true, only <code>DRYRUN.SUCCESS</code> is returned regardless of whether the request passes the dry run.</p>
     * </blockquote>
     * <ul>
     * <li>false: performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IDs of ECS instances. Valid values of N: 1 to 100.</p>
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
     * <p>The region ID of the ECS instance. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the most recent region list.</p>
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
