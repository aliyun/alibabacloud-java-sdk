// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the scaling activity that you want to query. You can call the DescribeScalingActivities operation to query the IDs of scaling activities.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asa-bp1c9djwrgxjyk31****</p>
     */
    @NameInMap("ScalingActivityId")
    public String scalingActivityId;

    public static DescribeScalingActivityDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityDetailRequest self = new DescribeScalingActivityDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingActivityDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScalingActivityDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingActivityDetailRequest setScalingActivityId(String scalingActivityId) {
        this.scalingActivityId = scalingActivityId;
        return this;
    }
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

}
