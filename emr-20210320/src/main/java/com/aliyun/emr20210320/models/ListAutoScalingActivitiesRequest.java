// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListAutoScalingActivitiesRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>查询伸缩活动创建时间的结束时间戳。单位为毫秒。</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>一次获取的最大记录数。取值范围：1~100。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>标记当前开始读取的位置，置空表示从头开始。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>节点组ID。节点组 Id-针对 ACK 集群，此字段为空。</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>伸缩活动状态。数组元数个数N的取值范围：1~20。默认取值：</p>
     * <p>- REJECTED：拒绝。</p>
     * <p>- SUCCESSFUL：成功。</p>
     * <p>- FAILED：失败。</p>
     * <p>- IN_PROGRESS：进行中。</p>
     */
    @NameInMap("ScalingActivityStates")
    public java.util.List<String> scalingActivityStates;

    /**
     * <p>伸缩活动类型。数组元数个数N的取值范围：1~20。取值范围：</p>
     * <p>- SCALE_OUT：扩容。</p>
     * <p>- SCALE_IN：缩容。</p>
     */
    @NameInMap("ScalingActivityType")
    public String scalingActivityType;

    /**
     * <p>伸缩规则名称。</p>
     */
    @NameInMap("ScalingRuleName")
    public String scalingRuleName;

    /**
     * <p>查询伸缩活动创建时间的时间戳。单位为毫秒。</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAutoScalingActivitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAutoScalingActivitiesRequest self = new ListAutoScalingActivitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListAutoScalingActivitiesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAutoScalingActivitiesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAutoScalingActivitiesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoScalingActivitiesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoScalingActivitiesRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ListAutoScalingActivitiesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAutoScalingActivitiesRequest setScalingActivityStates(java.util.List<String> scalingActivityStates) {
        this.scalingActivityStates = scalingActivityStates;
        return this;
    }
    public java.util.List<String> getScalingActivityStates() {
        return this.scalingActivityStates;
    }

    public ListAutoScalingActivitiesRequest setScalingActivityType(String scalingActivityType) {
        this.scalingActivityType = scalingActivityType;
        return this;
    }
    public String getScalingActivityType() {
        return this.scalingActivityType;
    }

    public ListAutoScalingActivitiesRequest setScalingRuleName(String scalingRuleName) {
        this.scalingRuleName = scalingRuleName;
        return this;
    }
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public ListAutoScalingActivitiesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
