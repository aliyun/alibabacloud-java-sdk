// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsMetricTrendsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <br>
     * <p>>  The end time must be later than the start time. You can view the data of up to seven days in the previous 30 days.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metric whose trend you want to query. Valid values:</p>
     * <br>
     * <p>*   **count**: the number of executions.</p>
     * <p>*   **avgRt**: the average execution duration.</p>
     * <p>*   **rtRate**: the execution duration percentage.</p>
     * <p>*   **rowsExamined**: the total number of scanned rows.</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The node ID.</p>
     * <br>
     * <p>>  You must specify this parameter for an ApsaraDB RDS for MySQL cluster instance and a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
