// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class QueryPredictiveValueRequest extends TeaModel {
    /**
     * <p>The end time of the predicted number of instances in the scaling group. The time follows the ISO8601 standard and uses UTC time.</p>
     * <p>Format: yyyy-MM-ddTHH:mmZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-18T08:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the monitoring metric of the prediction rule. Valid values:</p>
     * <ul>
     * <li>CpuUtilization: the average CPU utilization.</li>
     * <li>IntranetRx: the inbound traffic over an internal network.</li>
     * <li>IntranetTx: the outbound traffic over an internal network.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CpuUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

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
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-2zee0wsy0zkdxxxxx</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The start time of the predicted number of instances in the scaling group. The time follows the ISO8601 standard and uses UTC time.</p>
     * <p>Format: yyyy-MM-ddTHH:mmZ.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-17T08:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The current value of the monitoring metric of the prediction rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("TargetValue")
    public Float targetValue;

    public static QueryPredictiveValueRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPredictiveValueRequest self = new QueryPredictiveValueRequest();
        return TeaModel.build(map, self);
    }

    public QueryPredictiveValueRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryPredictiveValueRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public QueryPredictiveValueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryPredictiveValueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public QueryPredictiveValueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryPredictiveValueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryPredictiveValueRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public QueryPredictiveValueRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryPredictiveValueRequest setTargetValue(Float targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public Float getTargetValue() {
        return this.targetValue;
    }

}
