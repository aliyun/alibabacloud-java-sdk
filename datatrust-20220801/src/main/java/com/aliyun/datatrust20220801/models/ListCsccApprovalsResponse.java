// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccApprovalsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListCsccApprovalsResponseBody body;

    public static ListCsccApprovalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCsccApprovalsResponse self = new ListCsccApprovalsResponse();
        return TeaModel.build(map, self);
    }

    public ListCsccApprovalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCsccApprovalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCsccApprovalsResponse setBody(ListCsccApprovalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCsccApprovalsResponseBody getBody() {
        return this.body;
    }

}
