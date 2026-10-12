// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMetricTopRequest extends TeaModel {
    /**
     * <p>For instance-level monitoring, specify a list of cloud phone instance IDs.
     * &lt;props=&quot;china&quot;&gt;For matrix-level monitoring, specify a list of matrix IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>The end time of the query for the monitoring metric. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-31 11:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The list of instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The number of entries to return on each page for the monitoring data. This parameter is used for paging in a paged query.</p>
     * <blockquote>
     * <p>If the monitoring metric is instance_in_traffic or instance_out_traffic, the maximum value is 100.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The list of monitoring metrics.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricNames")
    public java.util.List<String> metricNames;

    /**
     * <p>The token that marks the position from which to start reading. If this parameter is left empty, the query starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6l5V9uONHqPtDLM2U8s****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistical period of the monitoring data.
     * Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The start time of the query for the monitoring metric. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-31 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMetricTopRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricTopRequest self = new DescribeMetricTopRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricTopRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public DescribeMetricTopRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricTopRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMetricTopRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeMetricTopRequest setMetricNames(java.util.List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }
    public java.util.List<String> getMetricNames() {
        return this.metricNames;
    }

    public DescribeMetricTopRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricTopRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeMetricTopRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
