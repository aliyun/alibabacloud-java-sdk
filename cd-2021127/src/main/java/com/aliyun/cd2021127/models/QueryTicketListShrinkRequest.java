// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryTicketListShrinkRequest extends TeaModel {
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
    public String shopIdListShrink;

    // 创建时间-开始时间(毫秒)-可选
    @NameInMap("StartTime")
    public Long startTime;

    // 工单状态-可选
    @NameInMap("Status")
    public Integer status;

    // 工单ID列表-可选
    @NameInMap("TicketIdList")
    public String ticketIdListShrink;

    // 工单告警类型列表-必填
    @NameInMap("TicketTypeList")
    public String ticketTypeListShrink;

    public static QueryTicketListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketListShrinkRequest self = new QueryTicketListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketListShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryTicketListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTicketListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTicketListShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

    public QueryTicketListShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public QueryTicketListShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QueryTicketListShrinkRequest setTicketIdListShrink(String ticketIdListShrink) {
        this.ticketIdListShrink = ticketIdListShrink;
        return this;
    }
    public String getTicketIdListShrink() {
        return this.ticketIdListShrink;
    }

    public QueryTicketListShrinkRequest setTicketTypeListShrink(String ticketTypeListShrink) {
        this.ticketTypeListShrink = ticketTypeListShrink;
        return this;
    }
    public String getTicketTypeListShrink() {
        return this.ticketTypeListShrink;
    }

}
