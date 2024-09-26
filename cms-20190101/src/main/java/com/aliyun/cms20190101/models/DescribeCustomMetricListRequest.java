// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomMetricListRequest extends TeaModel {
    /**
     * <p>The dimensions based on which the resources are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>{sampleName1=value1&amp;sampleName2=value2}</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The ID of the application group.</p>
     * <p>For information about how to query the IDs of application groups, see <a href="https://help.aliyun.com/document_detail/115032.html">DescribeMonitorGroups</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>7378****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The MD5 value of the HTTP request body. The MD5 value is a 128-bit hash value used to verify the uniqueness of the reported monitoring data.</p>
     * 
     * <strong>example:</strong>
     * <p>97c25982d9745a231276bff27469****</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The name of the custom metric.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_total</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Pages start from page 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomMetricListRequest self = new DescribeCustomMetricListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomMetricListRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeCustomMetricListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeCustomMetricListRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public DescribeCustomMetricListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeCustomMetricListRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCustomMetricListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeCustomMetricListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
