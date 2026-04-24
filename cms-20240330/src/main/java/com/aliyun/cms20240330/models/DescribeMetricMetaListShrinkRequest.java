// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListShrinkRequest extends TeaModel {
    @NameInMap("labels")
    public String labelsShrink;

    /**
     * <strong>example:</strong>
     * <p>CMS</p>
     */
    @NameInMap("metaFormat")
    public String metaFormat;

    /**
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("metricName")
    public String metricName;

    /**
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("namespace")
    public String namespace;

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

    public static DescribeMetricMetaListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListShrinkRequest self = new DescribeMetricMetaListShrinkRequest();
        return TeaModel.build(map, self);
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
