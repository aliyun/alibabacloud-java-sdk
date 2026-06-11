// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListShrinkRequest extends TeaModel {
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
    public String labelsShrink;

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

    public static DescribeMetricMetaListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListShrinkRequest self = new DescribeMetricMetaListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricMetaListShrinkRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public DescribeMetricMetaListShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public DescribeMetricMetaListShrinkRequest setMetaFormat(String metaFormat) {
        this.metaFormat = metaFormat;
        return this;
    }
    public String getMetaFormat() {
        return this.metaFormat;
    }

    public DescribeMetricMetaListShrinkRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMetricMetaListShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeMetricMetaListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetricMetaListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
