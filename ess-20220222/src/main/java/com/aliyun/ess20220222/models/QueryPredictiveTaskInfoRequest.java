// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryPredictiveTaskInfoRequest extends TeaModel {
    /**
     * <p>The end time of the prediction task. The time follows the ISO8601 standard and uses UTC time.</p>
     * <p>Format: yyyy-MM-ddTHH:mmZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-18T08:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID</p>
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
     * <p>The ID of the prediction scaling rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asr-bp1dp8yd9f8xxxxx</p>
     */
    @NameInMap("ScalingRuleId")
    public String scalingRuleId;

    /**
     * <p>The start time of the prediction task. The time follows the ISO8601 standard and uses UTC time.</p>
     * <p>Format: yyyy-MM-ddTHH:mmZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-17T08:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QueryPredictiveTaskInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictiveTaskInfoRequest self = new QueryPredictiveTaskInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryPredictiveTaskInfoRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryPredictiveTaskInfoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryPredictiveTaskInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryPredictiveTaskInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryPredictiveTaskInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryPredictiveTaskInfoRequest setScalingRuleId(String scalingRuleId) {
        this.scalingRuleId = scalingRuleId;
        return this;
    }
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public QueryPredictiveTaskInfoRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
