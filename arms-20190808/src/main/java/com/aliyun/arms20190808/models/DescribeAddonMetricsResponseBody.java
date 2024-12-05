// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeAddonMetricsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The metric details.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAddonMetricsResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>B6A00968-82A8-4F14-9D1B-B53827DB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAddonMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonMetricsResponseBody self = new DescribeAddonMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddonMetricsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAddonMetricsResponseBody setData(java.util.List<DescribeAddonMetricsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAddonMetricsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAddonMetricsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAddonMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAddonMetricsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAddonMetricsResponseBodyDataLabels extends TeaModel {
        /**
         * <p>The description of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>The number of times a B-tree page of size PAGE_SIZE was successfully compressed.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>page_size</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The source of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("Source")
        public String source;

        public static DescribeAddonMetricsResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonMetricsResponseBodyDataLabels self = new DescribeAddonMetricsResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public DescribeAddonMetricsResponseBodyDataLabels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAddonMetricsResponseBodyDataLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAddonMetricsResponseBodyDataLabels setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class DescribeAddonMetricsResponseBodyDataMetricsLabels extends TeaModel {
        /**
         * <p>The description of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>PAGE_SIZE</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>page_size</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The source of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        @NameInMap("Source")
        public String source;

        public static DescribeAddonMetricsResponseBodyDataMetricsLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonMetricsResponseBodyDataMetricsLabels self = new DescribeAddonMetricsResponseBodyDataMetricsLabels();
            return TeaModel.build(map, self);
        }

        public DescribeAddonMetricsResponseBodyDataMetricsLabels setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAddonMetricsResponseBodyDataMetricsLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAddonMetricsResponseBodyDataMetricsLabels setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class DescribeAddonMetricsResponseBodyDataMetrics extends TeaModel {
        /**
         * <p>The description of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>The number of times a B-tree page of size PAGE_SIZE was successfully compressed.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Labels")
        public java.util.List<DescribeAddonMetricsResponseBodyDataMetricsLabels> labels;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_exporter_collector_duration_seconds</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <p>The type of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>GAUGE</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>bytes</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeAddonMetricsResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonMetricsResponseBodyDataMetrics self = new DescribeAddonMetricsResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeAddonMetricsResponseBodyDataMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAddonMetricsResponseBodyDataMetrics setLabels(java.util.List<DescribeAddonMetricsResponseBodyDataMetricsLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeAddonMetricsResponseBodyDataMetricsLabels> getLabels() {
            return this.labels;
        }

        public DescribeAddonMetricsResponseBodyDataMetrics setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public DescribeAddonMetricsResponseBodyDataMetrics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeAddonMetricsResponseBodyDataMetrics setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeAddonMetricsResponseBodyData extends TeaModel {
        /**
         * <p>The metric group.</p>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Labels")
        public java.util.List<DescribeAddonMetricsResponseBodyDataLabels> labels;

        /**
         * <p>The metrics.</p>
         */
        @NameInMap("Metrics")
        public java.util.List<DescribeAddonMetricsResponseBodyDataMetrics> metrics;

        public static DescribeAddonMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddonMetricsResponseBodyData self = new DescribeAddonMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAddonMetricsResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public DescribeAddonMetricsResponseBodyData setLabels(java.util.List<DescribeAddonMetricsResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeAddonMetricsResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public DescribeAddonMetricsResponseBodyData setMetrics(java.util.List<DescribeAddonMetricsResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<DescribeAddonMetricsResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

    }

}
