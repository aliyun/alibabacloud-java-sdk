// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListPaymentStatementDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StatementDetailsDTOList")
    public java.util.List<PaymentStatementDetails> statementDetailsDTOList;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPaymentStatementDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPaymentStatementDetailsResponseBody self = new ListPaymentStatementDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPaymentStatementDetailsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListPaymentStatementDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPaymentStatementDetailsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPaymentStatementDetailsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPaymentStatementDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPaymentStatementDetailsResponseBody setStatementDetailsDTOList(java.util.List<PaymentStatementDetails> statementDetailsDTOList) {
        this.statementDetailsDTOList = statementDetailsDTOList;
        return this;
    }
    public java.util.List<PaymentStatementDetails> getStatementDetailsDTOList() {
        return this.statementDetailsDTOList;
    }

    public ListPaymentStatementDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListPaymentStatementDetailsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
