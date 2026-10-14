// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListAgenticDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAgenticDatabaseResponseBody body;

    public static ListAgenticDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgenticDatabaseResponse self = new ListAgenticDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public ListAgenticDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAgenticDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAgenticDatabaseResponse setBody(ListAgenticDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAgenticDatabaseResponseBody getBody() {
        return this.body;
    }

}
