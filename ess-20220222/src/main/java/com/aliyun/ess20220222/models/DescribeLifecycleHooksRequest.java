// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksRequest extends TeaModel {
    /**
     * <p>The IDs of the lifecycle hooks.</p>
     * <blockquote>
     * <p>Conditionally required: You must specify at least one of LifecycleHookIds or ScalingGroupId when you query lifecycle hooks. If you specify both parameters, LifecycleHookIds takes precedence. If you specify only RegionId without specifying either of the two parameters, a 400 InvalidParameter error is returned.</p>
     * </blockquote>
     */
    @NameInMap("LifecycleHookIds")
    public java.util.List<String> lifecycleHookIds;

    /**
     * <p>The name of the lifecycle hook.</p>
     * 
     * <strong>example:</strong>
     * <p>lifecyclehook****</p>
     */
    @NameInMap("LifecycleHookName")
    public String lifecycleHookName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the instance status list. Pages start from 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 50.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <blockquote>
     * <p>Conditionally required: You must specify at least one of LifecycleHookIds or ScalingGroupId when you query lifecycle hooks. If you specify only RegionId without specifying either of the two parameters, a 400 InvalidParameter error is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>asg-bp1igpak5ft1flyp****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    public static DescribeLifecycleHooksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleHooksRequest self = new DescribeLifecycleHooksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleHooksRequest setLifecycleHookIds(java.util.List<String> lifecycleHookIds) {
        this.lifecycleHookIds = lifecycleHookIds;
        return this;
    }
    public java.util.List<String> getLifecycleHookIds() {
        return this.lifecycleHookIds;
    }

    public DescribeLifecycleHooksRequest setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
    }

    public DescribeLifecycleHooksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeLifecycleHooksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLifecycleHooksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecycleHooksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLifecycleHooksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLifecycleHooksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLifecycleHooksRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

}
