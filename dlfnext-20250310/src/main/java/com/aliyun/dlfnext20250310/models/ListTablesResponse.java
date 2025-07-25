// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTablesResponseBody body;

    public static ListTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTablesResponse self = new ListTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTablesResponse setBody(ListTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTablesResponseBody getBody() {
        return this.body;
    }

}
