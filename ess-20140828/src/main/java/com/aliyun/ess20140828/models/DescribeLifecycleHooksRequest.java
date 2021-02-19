// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    @NameInMap("LifecycleHookName")
    public String lifecycleHookName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("LifecycleHookId")
    public java.util.List<String> lifecycleHookId;

    public static DescribeLifecycleHooksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleHooksRequest self = new DescribeLifecycleHooksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleHooksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLifecycleHooksRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLifecycleHooksRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeLifecycleHooksRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeLifecycleHooksRequest setLifecycleHookName(String lifecycleHookName) {
        this.lifecycleHookName = lifecycleHookName;
        return this;
    }
    public String getLifecycleHookName() {
        return this.lifecycleHookName;
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

    public DescribeLifecycleHooksRequest setLifecycleHookId(java.util.List<String> lifecycleHookId) {
        this.lifecycleHookId = lifecycleHookId;
        return this;
    }
    public java.util.List<String> getLifecycleHookId() {
        return this.lifecycleHookId;
    }

}
