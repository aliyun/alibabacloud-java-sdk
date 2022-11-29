// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryFaultDeviceListShrinkRequest extends TeaModel {
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
    public String shopIdListShrink;

    @NameInMap("StartDate")
    public String startDate;

    public static QueryFaultDeviceListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaultDeviceListShrinkRequest self = new QueryFaultDeviceListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaultDeviceListShrinkRequest setDailyOnlineTime(Integer dailyOnlineTime) {
        this.dailyOnlineTime = dailyOnlineTime;
        return this;
    }
    public Integer getDailyOnlineTime() {
        return this.dailyOnlineTime;
    }

    public QueryFaultDeviceListShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryFaultDeviceListShrinkRequest setFaultType(String faultType) {
        this.faultType = faultType;
        return this;
    }
    public String getFaultType() {
        return this.faultType;
    }

    public QueryFaultDeviceListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryFaultDeviceListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFaultDeviceListShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

    public QueryFaultDeviceListShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
