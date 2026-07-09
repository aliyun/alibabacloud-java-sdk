// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListRequest extends TeaModel {
    /**
     * <p>The keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>实例理论</p>
     */
    @NameInMap("keywords")
    public String keywords;

    /**
     * <p>Filters resources by label. The following labels are supported:</p>
     * <ul>
     * <li>metricCategory: the metric category description.</li>
     * <li>alertEnable: specifies whether alerting is required.</li>
     * <li>alertUnit: the recommended alert unit.</li>
     * <li>unitFactor: the unit conversion factor.</li>
     * <li>minAlertPeriod: the minimum alert period.</li>
     * <li>productCategory: the service type category.</li>
     * </ul>
     */
    @NameInMap("labels")
    public java.util.List<DescribeMetricMetaListRequestLabels> labels;

    /**
     * <p>The metadata source. Valid values:</p>
     * <ul>
     * <li>CMS: CloudMonitor Basic monitoring metrics.</li>
     * <li>PROM_BASIC: Managed Service for Prometheus monitoring metrics.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CMS</p>
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
     * <p>The namespace, which is used to distinguish between services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("namespace")
    public String namespace;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 2000.</p>
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
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>productCategory</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The label value.</p>
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
