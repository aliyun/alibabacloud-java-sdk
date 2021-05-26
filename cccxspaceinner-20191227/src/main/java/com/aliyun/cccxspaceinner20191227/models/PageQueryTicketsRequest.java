// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class PageQueryTicketsRequest extends TeaModel {
    // buid
    @NameInMap("BuId")
    public Long buId;

    // ticketType
    @NameInMap("TicketType")
    public Integer ticketType;

    // ticketId
    @NameInMap("TicketId")
    public Long ticketId;

    // memberId
    @NameInMap("MemberId")
    public Long memberId;

    // pageNo
    @NameInMap("PageNo")
    public Integer pageNo;

    // pageSize
    @NameInMap("PageSize")
    public Integer pageSize;

    public static PageQueryTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryTicketsRequest self = new PageQueryTicketsRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryTicketsRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public PageQueryTicketsRequest setTicketType(Integer ticketType) {
        this.ticketType = ticketType;
        return this;
    }
    public Integer getTicketType() {
        return this.ticketType;
    }

    public PageQueryTicketsRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

    public PageQueryTicketsRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public PageQueryTicketsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public PageQueryTicketsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
