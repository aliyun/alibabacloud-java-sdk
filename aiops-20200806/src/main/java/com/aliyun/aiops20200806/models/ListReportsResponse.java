// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListReportsResponseBody body;

    public static ListReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListReportsResponse self = new ListReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListReportsResponse setBody(ListReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListReportsResponseBody getBody() {
        return this.body;
    }

}
