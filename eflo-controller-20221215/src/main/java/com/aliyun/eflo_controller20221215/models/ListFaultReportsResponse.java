// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListFaultReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFaultReportsResponseBody body;

    public static ListFaultReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaultReportsResponse self = new ListFaultReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListFaultReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFaultReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFaultReportsResponse setBody(ListFaultReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFaultReportsResponseBody getBody() {
        return this.body;
    }

}
