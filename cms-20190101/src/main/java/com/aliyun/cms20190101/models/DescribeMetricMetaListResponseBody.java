// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of returned records.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request was successful. The value true indicates success. The value false indicates failure.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the metric.</p>
     */
    @NameInMap("Resources")
    public DescribeMetricMetaListResponseBodyResources resources;

    /**
     * <p>The name of the metric.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The configuration of the metric.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeMetricMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListResponseBody self = new DescribeMetricMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricMetaListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMetricMetaListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMetricMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricMetaListResponseBody setResources(DescribeMetricMetaListResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeMetricMetaListResponseBodyResources getResources() {
        return this.resources;
    }

    public DescribeMetricMetaListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMetricMetaListResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMetricMetaListResponseBodyResourcesResource extends TeaModel {
        /**
         * <p>The unit of the metric.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The statistical period of the metric. Multiple statistical periods are separated with commas (,).</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The dimensions of the metric. Multiple dimensions are separated with commas (,).</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The tags of the metric, including one or more JSON strings. Format: `[{"name":"tag name","value":"tag value"}]`. The `name` can be repeated.</p>
         * <br>
         * <p>The following tags are available:</p>
         * <br>
         * <p>*   metricCategory: the category of the metric.</p>
         * <p>*   alertEnable: specifies whether to report alerts for the metric.</p>
         * <p>*   alertUnit: the suggested unit of the metric value in alerts.</p>
         * <p>*   unitFactor: the factor for metric unit conversion.</p>
         * <p>*   minAlertPeriod: the minimum time interval to report a new alert.</p>
         * <p>*   productCategory: the category of the service.</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The statistical method. Multiple statistic methods are separated with commas (,).</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>This operation is usually used with DescribeMetricList and DescribeMetricLast. For more information, see [DescribeMetricList](~~51936~~) and [DescribeMetricLast](~~51939~~).</p>
         */
        @NameInMap("Periods")
        public String periods;

        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The namespace of the service. The value is usually in the format of acs_Service.</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static DescribeMetricMetaListResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricMetaListResponseBodyResourcesResource self = new DescribeMetricMetaListResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeMetricMetaListResponseBodyResourcesResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMetricMetaListResponseBodyResourcesResource setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public DescribeMetricMetaListResponseBodyResourcesResource setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public DescribeMetricMetaListResponseBodyResourcesResource setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricMetaListResponseBodyResourcesResource setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMetricMetaListResponseBodyResourcesResource setPeriods(String periods) {
            this.periods = periods;
            return this;
        }
        public String getPeriods() {
            return this.periods;
        }

        public DescribeMetricMetaListResponseBodyResourcesResource setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricMetaListResponseBodyResourcesResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class DescribeMetricMetaListResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeMetricMetaListResponseBodyResourcesResource> resource;

        public static DescribeMetricMetaListResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricMetaListResponseBodyResources self = new DescribeMetricMetaListResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeMetricMetaListResponseBodyResources setResource(java.util.List<DescribeMetricMetaListResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeMetricMetaListResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
