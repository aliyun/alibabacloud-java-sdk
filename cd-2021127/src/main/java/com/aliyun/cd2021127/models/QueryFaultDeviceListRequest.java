// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryFaultDeviceListRequest extends TeaModel {
    @NameInMap("DailyOnlineTime")
    public Integer dailyOnlineTime;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("FaultType")
    public String faultType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    @NameInMap("StartDate")
    public String startDate;

    public static QueryFaultDeviceListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaultDeviceListRequest self = new QueryFaultDeviceListRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaultDeviceListRequest setDailyOnlineTime(Integer dailyOnlineTime) {
        this.dailyOnlineTime = dailyOnlineTime;
        return this;
    }
    public Integer getDailyOnlineTime() {
        return this.dailyOnlineTime;
    }

    public QueryFaultDeviceListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryFaultDeviceListRequest setFaultType(String faultType) {
        this.faultType = faultType;
        return this;
    }
    public String getFaultType() {
        return this.faultType;
    }

    public QueryFaultDeviceListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryFaultDeviceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFaultDeviceListRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    public QueryFaultDeviceListRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
