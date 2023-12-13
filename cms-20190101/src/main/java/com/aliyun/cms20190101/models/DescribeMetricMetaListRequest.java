// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListRequest extends TeaModel {
    /**
     * <p>The tags for filtering metrics. Specify a JSON string.</p>
     * <br>
     * <p>Format:`[{"name":"tag name","value":"tag value"},{"name":"tag name","value":"tag value"}]`. The following tags are available:</p>
     * <br>
     * <p>*   metricCategory: the category of the metric.</p>
     * <p>*   alertEnable: specifies whether to report alerts for the metric.</p>
     * <p>*   alertUnit: the suggested unit of the metric value in alerts.</p>
     * <p>*   unitFactor: the factor for metric unit conversion.</p>
     * <p>*   minAlertPeriod: the minimum time interval to report a new alert.</p>
     * <p>*   productCategory: the category of the service.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The name of the metric. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The namespace of the service.</p>
     * <br>
     * <p>For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page to return. Default value: 1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

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

    public DescribeMetricMetaListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
