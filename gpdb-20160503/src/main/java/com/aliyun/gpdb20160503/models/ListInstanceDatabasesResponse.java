// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListInstanceDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceDatabasesResponseBody body;

    public static ListInstanceDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceDatabasesResponse self = new ListInstanceDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceDatabasesResponse setBody(ListInstanceDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceDatabasesResponseBody getBody() {
        return this.body;
    }

}
