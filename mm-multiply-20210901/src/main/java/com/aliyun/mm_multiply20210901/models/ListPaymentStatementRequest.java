// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListPaymentStatementRequest extends TeaModel {
    @NameInMap("MallId")
    public String mallId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PayDateEnd")
    public String payDateEnd;

    @NameInMap("PayDateStart")
    public String payDateStart;

    public static ListPaymentStatementRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPaymentStatementRequest self = new ListPaymentStatementRequest();
        return TeaModel.build(map, self);
    }

    public ListPaymentStatementRequest setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

    public ListPaymentStatementRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPaymentStatementRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPaymentStatementRequest setPayDateEnd(String payDateEnd) {
        this.payDateEnd = payDateEnd;
        return this;
    }
    public String getPayDateEnd() {
        return this.payDateEnd;
    }

    public ListPaymentStatementRequest setPayDateStart(String payDateStart) {
        this.payDateStart = payDateStart;
        return this;
    }
    public String getPayDateStart() {
        return this.payDateStart;
    }

}
