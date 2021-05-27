// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class PageQueryTicketRequest extends TeaModel {
    // buId
    @NameInMap("BuId")
    public Long buId;

    // endDate
    @NameInMap("EndDate")
    public Long endDate;

    // pageNo
    @NameInMap("PageNo")
    public Integer pageNo;

    // ticketStatus
    @NameInMap("TicketStatus")
    public Integer ticketStatus;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    // ticketType
    @NameInMap("TicketType")
    public Integer ticketType;

    // ticketId
    @NameInMap("TicketId")
    public Long ticketId;

    // startDate
    @NameInMap("StartDate")
    public Long startDate;

    // memberId
    @NameInMap("MemberId")
    public Long memberId;

    public static PageQueryTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryTicketRequest self = new PageQueryTicketRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryTicketRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public PageQueryTicketRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public PageQueryTicketRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public PageQueryTicketRequest setTicketStatus(Integer ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public Integer getTicketStatus() {
        return this.ticketStatus;
    }

    public PageQueryTicketRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageQueryTicketRequest setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
        return this;
    }
    public Integer getTicketType() {
        return this.ticketType;
    }

    public PageQueryTicketRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

    public PageQueryTicketRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public PageQueryTicketRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

}
