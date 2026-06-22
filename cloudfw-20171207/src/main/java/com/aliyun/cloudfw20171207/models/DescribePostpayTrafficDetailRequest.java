// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficDetailRequest extends TeaModel {
    /**
     * <p>The page number in a paged query.
     * Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The end time of the query. Specify the value in the YYYYMMDD format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240131</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The field by which to sort the results. Valid values:</p>
     * <ul>
     * <li><strong>resourceId</strong>: resource ID.</li>
     * <li><strong>trafficDay</strong>: date.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>resourceId</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page in a paged query. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region information.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The IP address or instance ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    /**
     * <p>The start time of the query. Specify the value in the YYYYMMDD format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20240101</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of traffic boundary for statistics. This parameter is required. Valid values:</p>
     * <ul>
     * <li><p><strong>EIP_TRAFFIC</strong>: Internet border traffic.</p>
     * </li>
     * <li><p><strong>NatGateway_TRAFFIC</strong>: NAT border traffic.</p>
     * </li>
     * <li><p><strong>VPC_TRAFFIC</strong>: VPC border traffic.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC_TRAFFIC</p>
     */
    @NameInMap("TrafficType")
    public String trafficType;

    public static DescribePostpayTrafficDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayTrafficDetailRequest self = new DescribePostpayTrafficDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePostpayTrafficDetailRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribePostpayTrafficDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePostpayTrafficDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePostpayTrafficDetailRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribePostpayTrafficDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePostpayTrafficDetailRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribePostpayTrafficDetailRequest setSearchItem(String searchItem) {
        this.searchItem = searchItem;
        return this;
    }
    public String getSearchItem() {
        return this.searchItem;
    }

    public DescribePostpayTrafficDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePostpayTrafficDetailRequest setTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }
    public String getTrafficType() {
        return this.trafficType;
    }

}
