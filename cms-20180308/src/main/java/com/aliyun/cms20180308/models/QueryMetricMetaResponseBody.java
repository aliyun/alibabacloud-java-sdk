// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricMetaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>0CCE0AF0-053C-4B13-A583-DC9A85785D49</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public QueryMetricMetaResponseBodyResources resources;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryMetricMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricMetaResponseBody self = new QueryMetricMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMetricMetaResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMetricMetaResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryMetricMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMetricMetaResponseBody setResources(QueryMetricMetaResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public QueryMetricMetaResponseBodyResources getResources() {
        return this.resources;
    }

    public QueryMetricMetaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMetricMetaResponseBodyResourcesResource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ECS.CPUUtilization</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("Dimensions")
        public String dimensions;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;alertUnit\&quot;,\&quot;value\&quot;:\&quot;%\&quot;},{\&quot;name\&quot;:\&quot;alertDefault\&quot;,\&quot;value\&quot;:\&quot;80\&quot;},{\&quot;name\&quot;:\&quot;minAlertPeriod\&quot;,\&quot;value\&quot;:\&quot;60\&quot;},{\&quot;name\&quot;:\&quot;metricCategory\&quot;,\&quot;value\&quot;:\&quot;instanceId\&quot;},{\&quot;name\&quot;:\&quot;is_alarm\&quot;,\&quot;value\&quot;:\&quot;true\&quot;}]&quot;</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        @NameInMap("Metric")
        public String metric;

        /**
         * <strong>example:</strong>
         * <p>60,300</p>
         */
        @NameInMap("Periods")
        public String periods;

        /**
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <strong>example:</strong>
         * <p>Average,Minimum,Maximum</p>
         */
        @NameInMap("Statistics")
        public String statistics;

        /**
         * <strong>example:</strong>
         * <p>%</p>
         */
        @NameInMap("Unit")
        public String unit;

        public static QueryMetricMetaResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            QueryMetricMetaResponseBodyResourcesResource self = new QueryMetricMetaResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public QueryMetricMetaResponseBodyResourcesResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMetricMetaResponseBodyResourcesResource setDimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public String getDimensions() {
            return this.dimensions;
        }

        public QueryMetricMetaResponseBodyResourcesResource setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public QueryMetricMetaResponseBodyResourcesResource setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public QueryMetricMetaResponseBodyResourcesResource setPeriods(String periods) {
            this.periods = periods;
            return this;
        }
        public String getPeriods() {
            return this.periods;
        }

        public QueryMetricMetaResponseBodyResourcesResource setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public QueryMetricMetaResponseBodyResourcesResource setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public QueryMetricMetaResponseBodyResourcesResource setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

    public static class QueryMetricMetaResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<QueryMetricMetaResponseBodyResourcesResource> resource;

        public static QueryMetricMetaResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            QueryMetricMetaResponseBodyResources self = new QueryMetricMetaResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public QueryMetricMetaResponseBodyResources setResource(java.util.List<QueryMetricMetaResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<QueryMetricMetaResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
