// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionIdResourceRequest extends TeaModel {
    /**
     * <p>The end time of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-06-16T06:33:15</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The Internet service provider (ISP). Valid values:</p>
     * <ul>
     * <li>cmcc: China Mobile</li>
     * <li>telecom: China Telecom</li>
     * <li>unicom: China Unicom</li>
     * <li>multiCarrier: multi-line ISP</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cmcc</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>The order in which the resources to return are sorted. Valid values:</p>
     * <ul>
     * <li>InstanceCount: desc</li>
     * <li>Area: asc</li>
     * <li>InternetBandwidth: asc</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InstanceCount: desc</p>
     */
    @NameInMap("OrderByParams")
    public String orderByParams;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-06-16T06:33:15Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEnsRegionIdResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionIdResourceRequest self = new DescribeEnsRegionIdResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionIdResourceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEnsRegionIdResourceRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeEnsRegionIdResourceRequest setOrderByParams(String orderByParams) {
        this.orderByParams = orderByParams;
        return this;
    }
    public String getOrderByParams() {
        return this.orderByParams;
    }

    public DescribeEnsRegionIdResourceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEnsRegionIdResourceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeEnsRegionIdResourceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
