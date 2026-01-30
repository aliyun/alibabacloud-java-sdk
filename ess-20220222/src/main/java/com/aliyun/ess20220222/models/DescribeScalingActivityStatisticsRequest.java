// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivityStatisticsRequest extends TeaModel {
    /**
     * <p>The end time of the statistical interval. The time follows the ISO 8601 standard and uses UTC time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-18T08:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the metric on which the scaling activity is counted. Valid values:</p>
     * <ul>
     * <li>ScalingActivityStatus: collects statistics on the distribution of scaling activities in different states within a time range.</li>
     * <li>ScalingActivityErrorCodes: the distribution of error codes in failed scaling activities within a time range.</li>
     * </ul>
     * <p>Default value: ScalingActivityStatus.</p>
     * 
     * <strong>example:</strong>
     * <p>ScalingActivityStatus</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
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
     * 
     * <strong>example:</strong>
     * <p>asg-8vbje5pofxxxxxxxx</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>The start time of the statistical interval. The time follows the ISO 8601 standard and uses UTC time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-15T08:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeScalingActivityStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivityStatisticsRequest self = new DescribeScalingActivityStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivityStatisticsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeScalingActivityStatisticsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeScalingActivityStatisticsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeScalingActivityStatisticsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeScalingActivityStatisticsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeScalingActivityStatisticsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeScalingActivityStatisticsRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public DescribeScalingActivityStatisticsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
