// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeSlowLogHistogramAsyncRequest extends TeaModel {
    /**
     * <p>The end time of the query. Specify a UNIX timestamp in milliseconds.</p>
     * <blockquote>
     * <p>The end time must be later than the start time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1662518540764</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The list of query filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<DescribeSlowLogHistogramAsyncRequestFilters> filters;

    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>For PolarDB for MySQL instances, specify the node ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The start time of the query. Specify a UNIX timestamp in milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSlowLogHistogramAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlowLogHistogramAsyncRequest self = new DescribeSlowLogHistogramAsyncRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlowLogHistogramAsyncRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSlowLogHistogramAsyncRequest setFilters(java.util.List<DescribeSlowLogHistogramAsyncRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<DescribeSlowLogHistogramAsyncRequestFilters> getFilters() {
        return this.filters;
    }

    public DescribeSlowLogHistogramAsyncRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSlowLogHistogramAsyncRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeSlowLogHistogramAsyncRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class DescribeSlowLogHistogramAsyncRequestFilters extends TeaModel {
        /**
         * <p>The filter parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSlowLogHistogramAsyncRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlowLogHistogramAsyncRequestFilters self = new DescribeSlowLogHistogramAsyncRequestFilters();
            return TeaModel.build(map, self);
        }

        public DescribeSlowLogHistogramAsyncRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSlowLogHistogramAsyncRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
