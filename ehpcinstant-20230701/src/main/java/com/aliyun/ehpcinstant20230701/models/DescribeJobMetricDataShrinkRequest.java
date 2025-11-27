// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobMetricDataShrinkRequest extends TeaModel {
    /**
     * <p>The list of array job indexes.</p>
     */
    @NameInMap("ArrayIndex")
    public String arrayIndexShrink;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>job-xxxxx</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The metrics of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_utilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>Task0</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static DescribeJobMetricDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobMetricDataShrinkRequest self = new DescribeJobMetricDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeJobMetricDataShrinkRequest setArrayIndexShrink(String arrayIndexShrink) {
        this.arrayIndexShrink = arrayIndexShrink;
        return this;
    }
    public String getArrayIndexShrink() {
        return this.arrayIndexShrink;
    }

    public DescribeJobMetricDataShrinkRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeJobMetricDataShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeJobMetricDataShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
