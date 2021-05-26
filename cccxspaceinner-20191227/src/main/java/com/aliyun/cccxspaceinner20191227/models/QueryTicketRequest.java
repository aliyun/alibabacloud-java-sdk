// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryTicketRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("TicketType")
    public Integer ticketType;

    @NameInMap("TicketStatus")
    public Integer ticketStatus;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("TicketId")
    public Long ticketId;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNo")
    public Integer pageNo;

    public static QueryTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketRequest self = new QueryTicketRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public QueryTicketRequest setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
        return this;
    }
    public Integer getTicketType() {
        return this.ticketType;
    }

    public QueryTicketRequest setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public Integer getTicketStatus() {
        return this.ticketStatus;
    }

    public QueryTicketRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public QueryTicketRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

    public QueryTicketRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public QueryTicketRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public QueryTicketRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTicketRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

}
