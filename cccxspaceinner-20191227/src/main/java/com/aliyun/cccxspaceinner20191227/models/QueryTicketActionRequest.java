// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryTicketActionRequest extends TeaModel {
    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("ActionCodeList")
    public String actionCodeList;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryTicketActionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketActionRequest self = new QueryTicketActionRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketActionRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public QueryTicketActionRequest setActionCodeList(String actionCodeList) {
        this.actionCodeList = actionCodeList;
        return this;
    }
    public String getActionCodeList() {
        return this.actionCodeList;
    }

    public QueryTicketActionRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryTicketActionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
