// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0CCE0AF0-053C-4B13-A583-DC9A85785D49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configuration of the metrics in the resources.</p>
     */
    @NameInMap("Resources")
    public DescribeMetricMetaListResponseBodyResources resources;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
         * <p>The metric description.</p>
         * 
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The monitoring dimensions of the resource. Multiple monitoring dimensions are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <p>The tags of the metric, including one or more JSON strings.</p>
         * <p>Format: <code>[{&quot;name&quot;:&quot;tag key&quot;,&quot;value&quot;:&quot;tag value&quot;}]</code>. The <code>name</code> can be repeated. The following tags are available:</p>
         * <ul>
         * <li>metricCategory: the category of the metric.</li>
         * <li>alertEnable: indicates whether to report alerts for the metric.</li>
         * <li>alertUnit: the unit of the metric in the alerts.</li>
         * <li>unitFactor: the factor for metric unit conversion.</li>
         * <li>minAlertPeriod: the minimum interval at which the alert is reported.</li>
         * <li>productCategory: the category of the service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;alertUnit\&quot;,\&quot;value\&quot;:\&quot;Bytes\&quot;},{\&quot;name\&quot;:\&quot;minAlertPeriod\&quot;,\&quot;value\&quot;:\&quot;60\&quot;},{\&quot;name\&quot;:\&quot;metricCategory\&quot;,\&quot;value\&quot;:\&quot;instanceId\&quot;},{\&quot;name\&quot;:\&quot;instanceType\&quot;,\&quot;value\&quot;:\&quot;disaster\&quot;},{\&quot;name\&quot;:\&quot;is_alarm\&quot;,\&quot;value\&quot;:\&quot;true\&quot;},{\&quot;name\&quot;:\&quot;productCategory\&quot;,\&quot;value\&quot;:\&quot;kvstore_old\&quot;}]</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        @NameInMap("MetricName")
        public String metricName;

        /**
         * <p>The namespace of the cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_kvstore</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The statistical periods of the metric. Multiple statistical periods are separated with commas (,).</p>
         * <p>Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60,300</p>
         */
        @NameInMap("Periods")
        public String periods;

        /**
         * <p>The statistical method. Multiple statistical methods are separated with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>Average,Minimum,Maximum</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <p>The unit of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
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
