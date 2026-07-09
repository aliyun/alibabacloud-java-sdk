// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size.</p>
     * 
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

    /**
     * <p>The metric configuration information of the resources.</p>
     */
    @NameInMap("resources")
    public java.util.List<DescribeMetricMetaListResponseBodyResources> resources;

    /**
     * <p>The total number of entries.</p>
     * 
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
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>user_id</p>
         */
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
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS CPU Utilization</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The dimension description.</p>
         */
        @NameInMap("dimensionDescription")
        public java.util.List<DescribeMetricMetaListResponseBodyResourcesDimensionDescription> dimensionDescription;

        /**
         * <p>The resource filtering dimensions of CloudMonitor Basic.</p>
         */
        @NameInMap("dimensions")
        public java.util.List<String> dimensions;

        /**
         * <p>The CloudMonitor labels. This parameter is returned only when metaFormat is set to CMS.</p>
         */
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        /**
         * <p>The metadata source. CMS indicates CloudMonitor Basic monitoring metrics. PROM_BASIC indicates Prometheus CloudMonitor basic monitoring metrics.</p>
         * <p>Sample value:
         * CMS
         * Valid values:
         * CMS
         * PROM_BASIC.</p>
         * 
         * <strong>example:</strong>
         * <p>PROM_BASIC</p>
         */
        @NameInMap("metaFormat")
        public String metaFormat;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>acs_ecs_dashboard</p>
         */
        @NameInMap("namespace")
        public String namespace;

        /**
         * <p>The period.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("periods")
        public String periods;

        /**
         * <p>The statistical method of the metric. Example values:</p>
         * <ul>
         * <li>Maximum: the maximum value.</li>
         * <li>Minimum: the minimum value.</li>
         * <li>Average: the average value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Maximum</p>
         */
        @NameInMap("statistics")
        public String statistics;

        /**
         * <p>The metric type.</p>
         * 
         * <strong>example:</strong>
         * <p>Gauge</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The unit.</p>
         * 
         * <strong>example:</strong>
         * <p>%</p>
         */
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

        public DescribeMetricMetaListResponseBodyResources setMetaFormat(String metaFormat) {
            this.metaFormat = metaFormat;
            return this;
        }
        public String getMetaFormat() {
            return this.metaFormat;
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
