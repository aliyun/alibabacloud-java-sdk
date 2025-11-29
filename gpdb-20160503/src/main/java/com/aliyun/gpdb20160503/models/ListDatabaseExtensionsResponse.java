// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListDatabaseExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatabaseExtensionsResponseBody body;

    public static ListDatabaseExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseExtensionsResponse self = new ListDatabaseExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabaseExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabaseExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabaseExtensionsResponse setBody(ListDatabaseExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabaseExtensionsResponseBody getBody() {
        return this.body;
    }

}
