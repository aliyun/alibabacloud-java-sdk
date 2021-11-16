// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBudgetTicketItemListByBizIdRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BudgetTicketNo")
    public String budgetTicketNo;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryBudgetTicketItemListByBizIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBudgetTicketItemListByBizIdRequest self = new QueryBudgetTicketItemListByBizIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryBudgetTicketItemListByBizIdRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBudgetTicketItemListByBizIdRequest setBudgetTicketNo(String budgetTicketNo) {
        this.budgetTicketNo = budgetTicketNo;
        return this;
    }
    public String getBudgetTicketNo() {
        return this.budgetTicketNo;
    }

    public QueryBudgetTicketItemListByBizIdRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryBudgetTicketItemListByBizIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
