// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryTicketListRequest extends TeaModel {
    // 创建时间-结束时间(毫秒)-可选
    @NameInMap("EndTime")
    public Long endTime;

    // 页码-必填
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页最大记录数-必填
    @NameInMap("PageSize")
    public Integer pageSize;

    // 问题门店ID列表-可选
    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    // 创建时间-开始时间(毫秒)-可选
    @NameInMap("StartTime")
    public Long startTime;

    // 工单状态-可选
    @NameInMap("Status")
    public Integer status;

    // 工单ID列表-可选
    @NameInMap("TicketIdList")
    public java.util.List<String> ticketIdList;

    // 工单告警类型列表-必填
    @NameInMap("TicketTypeList")
    public java.util.List<String> ticketTypeList;

    public static QueryTicketListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketListRequest self = new QueryTicketListRequest();
        return TeaModel.build(map, self);
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
