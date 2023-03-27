// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryTicketListRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TicketIdList")
    public java.util.List<String> ticketIdList;

    @NameInMap("TicketTypeList")
    public java.util.List<String> ticketTypeList;

    public static QueryTicketListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketListRequest self = new QueryTicketListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketListRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public QueryTicketListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTicketListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTicketListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTicketListRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    public QueryTicketListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryTicketListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryTicketListRequest setTicketIdList(java.util.List<String> ticketIdList) {
        this.ticketIdList = ticketIdList;
        return this;
    }
    public java.util.List<String> getTicketIdList() {
        return this.ticketIdList;
    }

    public QueryTicketListRequest setTicketTypeList(java.util.List<String> ticketTypeList) {
        this.ticketTypeList = ticketTypeList;
        return this;
    }
    public java.util.List<String> getTicketTypeList() {
        return this.ticketTypeList;
    }

}
