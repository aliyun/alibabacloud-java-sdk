// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeMetricListRequest extends TeaModel {
    /**
     * <p>For instance-level monitoring, enter a list of Cloud Phone instance IDs.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>For matrix-level monitoring, enter a list of matrix IDs.</p>
     */
    @NameInMap("AndroidInstanceIds")
    public java.util.List<String> androidInstanceIds;

    /**
     * <p>The end time for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-31 11:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>A list of instance IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The number of entries to return on each page for a paged query.</p>
     * <p>Default value: 1000. This means that 1000 monitoring data records are returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The monitoring metrics.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricNames")
    public java.util.List<String> metricNames;

    /**
     * <p>A token that marks the position from which the query starts. Leave it empty to start from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kw9dGL5jves2FS9RLq****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistic period of the monitoring data.</p>
     * <p>Valid values: 60, 900, and 3600.</p>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>A list of process monitoring metrics.</p>
     */
    @NameInMap("ProcessInfos")
    public java.util.List<DescribeMetricListRequestProcessInfos> processInfos;

    /**
     * <p>The start time for the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-31 10:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricListRequest self = new DescribeMetricListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricListRequest setAndroidInstanceIds(java.util.List<String> androidInstanceIds) {
        this.androidInstanceIds = androidInstanceIds;
        return this;
    }
    public java.util.List<String> getAndroidInstanceIds() {
        return this.androidInstanceIds;
    }

    public DescribeMetricListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMetricListRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMetricListRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeMetricListRequest setMetricNames(java.util.List<String> metricNames) {
        this.metricNames = metricNames;
        return this;
    }
    public java.util.List<String> getMetricNames() {
        return this.metricNames;
    }

    public DescribeMetricListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMetricListRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeMetricListRequest setProcessInfos(java.util.List<DescribeMetricListRequestProcessInfos> processInfos) {
        this.processInfos = processInfos;
        return this;
    }
    public java.util.List<DescribeMetricListRequestProcessInfos> getProcessInfos() {
        return this.processInfos;
    }

    public DescribeMetricListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeMetricListRequestProcessInfos extends TeaModel {
        /**
         * <p>A list of process IDs.</p>
         */
        @NameInMap("ProcessIds")
        public java.util.List<Integer> processIds;

        /**
         * <p>The process name.</p>
         * 
         * <strong>example:</strong>
         * <p>php-fpm</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        public static DescribeMetricListRequestProcessInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricListRequestProcessInfos self = new DescribeMetricListRequestProcessInfos();
            return TeaModel.build(map, self);
        }

        public DescribeMetricListRequestProcessInfos setProcessIds(java.util.List<Integer> processIds) {
            this.processIds = processIds;
            return this;
        }
        public java.util.List<Integer> getProcessIds() {
            return this.processIds;
        }

        public DescribeMetricListRequestProcessInfos setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

    }

}
