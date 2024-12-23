// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmsTablesResponseBody body;

    public static ListMmsTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTablesResponse self = new ListMmsTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListMmsTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmsTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmsTablesResponse setBody(ListMmsTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmsTablesResponseBody getBody() {
        return this.body;
    }

}
