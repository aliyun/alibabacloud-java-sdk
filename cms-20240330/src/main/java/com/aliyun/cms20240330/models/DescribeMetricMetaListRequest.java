// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListRequest extends TeaModel {
    @NameInMap("keywords")
    public String keywords;

    /**
     * <p>The labels used to filter resources. The following labels are supported:</p>
     * <ul>
     * <li><p><code>metricCategory</code>: The metric category.</p>
     * </li>
     * <li><p><code>alertEnable</code>: Indicates whether to enable alerts.</p>
     * </li>
     * <li><p><code>alertUnit</code>: The recommended unit for alerts.</p>
     * </li>
     * <li><p><code>unitFactor</code>: The unit conversion factor.</p>
     * </li>
     * <li><p><code>minAlertPeriod</code>: The minimum alert period.</p>
     * </li>
     * <li><p><code>productCategory</code>: The product category.</p>
     * </li>
     * </ul>
     */
    @NameInMap("labels")
    public java.util.List<DescribeMetricMetaListRequestLabels> labels;

    /**
     * <p>The source of the metadata. Valid values: <code>CMS</code> for CloudMonitor metrics and <code>PROM_BASIC</code> for basic Prometheus metrics.</p>
     * 
     * <strong>example:</strong>
     * <p>CMS</p>
     */
    @NameInMap("metaFormat")
    public String metaFormat;

    /**
     * <p>The name of the metric.</p>
     * 
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("metricName")
    public String metricName;

    /**
     * <p>The namespace of the product.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The number of the page to return. Default value: <code>1</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <code>2000</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static DescribeMetricMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListRequest self = new DescribeMetricMetaListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricMetaListRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public DescribeMetricMetaListRequest setLabels(java.util.List<DescribeMetricMetaListRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<DescribeMetricMetaListRequestLabels> getLabels() {
        return this.labels;
    }

    public DescribeMetricMetaListRequest setMetaFormat(String metaFormat) {
        this.metaFormat = metaFormat;
        return this;
    }
    public String getMetaFormat() {
        return this.metaFormat;
    }

    public DescribeMetricMetaListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricMetaListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricMetaListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetricMetaListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class DescribeMetricMetaListRequestLabels extends TeaModel {
        /**
         * <p>The key of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>productCategory</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("value")
        public String value;

        public static DescribeMetricMetaListRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetricMetaListRequestLabels self = new DescribeMetricMetaListRequestLabels();
            return TeaModel.build(map, self);
        }

        public DescribeMetricMetaListRequestLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeMetricMetaListRequestLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
