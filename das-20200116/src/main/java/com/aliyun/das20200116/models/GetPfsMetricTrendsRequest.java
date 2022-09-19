// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsMetricTrendsRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetPfsMetricTrendsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPfsMetricTrendsRequest self = new GetPfsMetricTrendsRequest();
        return TeaModel.build(map, self);
    }

    public GetPfsMetricTrendsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPfsMetricTrendsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPfsMetricTrendsRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public GetPfsMetricTrendsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetPfsMetricTrendsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
