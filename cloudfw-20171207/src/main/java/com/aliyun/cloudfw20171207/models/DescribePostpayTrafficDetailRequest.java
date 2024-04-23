// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayTrafficDetailRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The field based on which you want to sort the query results. Valid values:</p>
     * <br>
     * <p>*   **resourceId**</p>
     * <p>*   **trafficDay**</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The instance ID or the IP address of the asset.</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The traffic type. This parameter is required. Valid values:</p>
     * <br>
     * <p>*   **EIP_TRAFFIC**: traffic for the Internet firewall</p>
     * <p>*   **NatGateway_TRAFFIC**: traffic for the NAT firewall</p>
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
