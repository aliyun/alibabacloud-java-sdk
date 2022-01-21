// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public DescribeMetricMetaListResponseBodyResources resources;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Dimensions")
        public String dimensions;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("MetricName")
        public String metricName;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Periods")
        public String periods;

        @NameInMap("Statistics")
        public String statistics;

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
