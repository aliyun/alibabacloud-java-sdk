// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlMetricTrendsRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("SqlId")
    public String sqlId;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetPfsSqlMetricTrendsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlMetricTrendsRequest self = new GetPfsSqlMetricTrendsRequest();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlMetricTrendsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPfsSqlMetricTrendsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPfsSqlMetricTrendsRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public GetPfsSqlMetricTrendsRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetPfsSqlMetricTrendsRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetPfsSqlMetricTrendsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
