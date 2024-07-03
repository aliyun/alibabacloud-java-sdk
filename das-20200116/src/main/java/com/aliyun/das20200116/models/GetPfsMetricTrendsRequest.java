// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsMetricTrendsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. You can view the data of up to seven days in the previous 30 days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1678432430967</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-m5ea73876ukci****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metric whose trend you want to query. Valid values:</p>
     * <ul>
     * <li><strong>count</strong>: the number of executions.</li>
     * <li><strong>avgRt</strong>: the average execution duration.</li>
     * <li><strong>rtRate</strong>: the execution duration percentage.</li>
     * <li><strong>rowsExamined</strong>: the total number of scanned rows.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Count</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p> You must specify this parameter for an ApsaraDB RDS for MySQL cluster instance and a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-x****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1677461663092</p>
     */
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
