// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricDataRequest extends TeaModel {
    @NameInMap("ArrayIndex")
    public java.util.List<Integer> arrayIndex;

    /**
     * <strong>example:</strong>
     * <p>job-xxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>cpu_utilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <strong>example:</strong>
     * <p>Task0</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeJobMetricDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMetricDataRequest self = new DescribeJobMetricDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobMetricDataRequest setArrayIndex(java.util.List<Integer> arrayIndex) {
        this.arrayIndex = arrayIndex;
        return this;
    }
    public java.util.List<Integer> getArrayIndex() {
        return this.arrayIndex;
    }

    public DescribeJobMetricDataRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeJobMetricDataRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeJobMetricDataRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
