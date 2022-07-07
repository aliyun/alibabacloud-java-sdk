// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListPaymentStatementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPaymentStatementResponseBody body;

    public static ListPaymentStatementResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPaymentStatementResponse self = new ListPaymentStatementResponse();
        return TeaModel.build(map, self);
    }

    public ListPaymentStatementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPaymentStatementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPaymentStatementResponse setBody(ListPaymentStatementResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPaymentStatementResponseBody getBody() {
        return this.body;
    }

}
