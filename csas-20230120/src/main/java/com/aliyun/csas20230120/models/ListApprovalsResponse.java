// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApprovalsResponseBody body;

    public static ListApprovalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalsResponse self = new ListApprovalsResponse();
        return TeaModel.build(map, self);
    }

    public ListApprovalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApprovalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApprovalsResponse setBody(ListApprovalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApprovalsResponseBody getBody() {
        return this.body;
    }

}
