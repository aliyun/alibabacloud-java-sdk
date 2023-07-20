// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleActionsRequest extends TeaModel {
    @NameInMap("LifecycleActionStatus")
    public String lifecycleActionStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static DescribeLifecycleActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleActionsRequest self = new DescribeLifecycleActionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleActionsRequest setLifecycleActionStatus(String lifecycleActionStatus) {
        this.lifecycleActionStatus = lifecycleActionStatus;
        return this;
    }
    public String getLifecycleActionStatus() {
        return this.lifecycleActionStatus;
    }

    public DescribeLifecycleActionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLifecycleActionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLifecycleActionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLifecycleActionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLifecycleActionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeLifecycleActionsRequest setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
