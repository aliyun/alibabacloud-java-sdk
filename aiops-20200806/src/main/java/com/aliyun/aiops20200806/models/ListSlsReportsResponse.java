// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListSlsReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSlsReportsResponseBody body;

    public static ListSlsReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlsReportsResponse self = new ListSlsReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListSlsReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlsReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSlsReportsResponse setBody(ListSlsReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlsReportsResponseBody getBody() {
        return this.body;
    }

}
