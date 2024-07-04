// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleActionsRequest extends TeaModel {
    /**
     * <p>The status of the lifecycle action. Valid values:</p>
     * <ul>
     * <li>If a lifecycle action is in the Pending state, Elastic Compute Service (ECS) instances are waiting to be added to a scaling group or waiting to be removed from a scaling group.</li>
     * <li>If a lifecycle action is in the Timeout state, the lifecycle hook that triggers the lifecycle action ends, and ECS instances are added to or removed from the scaling group.</li>
     * <li>If a lifecycle action is in the Completed state, you manually end the lifecycle hook that triggers the lifecycle action ahead of schedule.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("LifecycleActionStatus")
    public String lifecycleActionStatus;

    /**
     * <p>The maximum number of entries to return on each page. Valid values: 1 to 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to specify the lifecycle action from which the query starts.</p>
     * <p>For example, after the first 10 lifecycle actions are queried, the query starts from the 11th lifecycle action. Set this parameter to the NextToken value that is returned in the previous API call. If you do not specify this parameter, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAcSz4VTb1Nq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling activity.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp17mug9t0pegagw****</p>
     */
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
