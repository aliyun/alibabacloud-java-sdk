// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resources")
    public java.util.List<DescribeMetricMetaListResponseBodyResources> resources;

    /**
     * <strong>example:</strong>
     * <p>6370</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static DescribeMetricMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListResponseBody self = new DescribeMetricMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetricMetaListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetricMetaListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMetricMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetricMetaListResponseBody setResources(java.util.List<DescribeMetricMetaListResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<DescribeMetricMetaListResponseBodyResources> getResources() {
        return this.resources;
    }

    public DescribeMetricMetaListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeMetricMetaListResponseBodyResourcesDimensionDescription extends TeaModel {
        @NameInMap("name")
        public String name;

        public static DescribeMetricMetaListResponseBodyResourcesDimensionDescription build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricMetaListResponseBodyResourcesDimensionDescription self = new DescribeMetricMetaListResponseBodyResourcesDimensionDescription();
            return TeaModel.build(map, self);
        }

        public DescribeMetricMetaListResponseBodyResourcesDimensionDescription setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeMetricMetaListResponseBodyResources extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("dimensionDescription")
        public java.util.List<DescribeMetricMetaListResponseBodyResourcesDimensionDescription> dimensionDescription;

        @NameInMap("dimensions")
        public java.util.List<String> dimensions;

        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        @NameInMap("metricName")
        public String metricName;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("periods")
        public String periods;

        @NameInMap("statistics")
        public String statistics;

        @NameInMap("type")
        public String type;

        @NameInMap("unit")
        public String unit;

        public static DescribeMetricMetaListResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricMetaListResponseBodyResources self = new DescribeMetricMetaListResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeMetricMetaListResponseBodyResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMetricMetaListResponseBodyResources setDimensionDescription(java.util.List<DescribeMetricMetaListResponseBodyResourcesDimensionDescription> dimensionDescription) {
            this.dimensionDescription = dimensionDescription;
            return this;
        }
        public java.util.List<DescribeMetricMetaListResponseBodyResourcesDimensionDescription> getDimensionDescription() {
            return this.dimensionDescription;
        }

        public DescribeMetricMetaListResponseBodyResources setDimensions(java.util.List<String> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<String> getDimensions() {
            return this.dimensions;
        }

        public DescribeMetricMetaListResponseBodyResources setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public DescribeMetricMetaListResponseBodyResources setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public DescribeMetricMetaListResponseBodyResources setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DescribeMetricMetaListResponseBodyResources setPeriods(String periods) {
            this.periods = periods;
            return this;
        }
        public String getPeriods() {
            return this.periods;
        }

        public DescribeMetricMetaListResponseBodyResources setStatistics(String statistics) {
            this.statistics = statistics;
            return this;
        }
        public String getStatistics() {
            return this.statistics;
        }

        public DescribeMetricMetaListResponseBodyResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMetricMetaListResponseBodyResources setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

    }

}
