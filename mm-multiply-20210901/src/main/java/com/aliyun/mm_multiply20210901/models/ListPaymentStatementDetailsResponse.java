// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListPaymentStatementDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPaymentStatementDetailsResponseBody body;

    public static ListPaymentStatementDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPaymentStatementDetailsResponse self = new ListPaymentStatementDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListPaymentStatementDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPaymentStatementDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPaymentStatementDetailsResponse setBody(ListPaymentStatementDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPaymentStatementDetailsResponseBody getBody() {
        return this.body;
    }

}
