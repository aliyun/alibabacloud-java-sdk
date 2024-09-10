// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListRequest extends TeaModel {
    /**
     * <p>The tags for filtering metrics. Specify a JSON string.</p>
     * <p>Format: <code>[{&quot;name&quot;:&quot;tag key&quot;,&quot;value&quot;:&quot;tag value&quot;},{&quot;name&quot;:&quot;tag key&quot;,&quot;value&quot;:&quot;tag value&quot;}] </code>. The following tags are available:</p>
     * <ul>
     * <li>metricCategory: the category of the metric.</li>
     * <li>alertEnable: specifies whether to report alerts for the metric.</li>
     * <li>alertUnit: the unit of the metric in the alerts.</li>
     * <li>unitFactor: the factor for metric unit conversion.</li>
     * <li>minAlertPeriod: the minimum interval at which the alert is reported.</li>
     * <li>productCategory: the category of the service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;productCategory&quot;,&quot;value&quot;:&quot;kvstore_old&quot;}]</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The metric name. For more information, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the cloud service.</p>
     * <p>For more information about the namespaces of cloud services, see <a href="https://help.aliyun.com/document_detail/163515.html">Appendix 1: Metrics</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_kvstore</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeMetricMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListRequest self = new DescribeMetricMetaListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMetricMetaListRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
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

}
