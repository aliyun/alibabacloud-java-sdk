// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListMigrationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMigrationsResponseBody body;

    public static ListMigrationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationsResponse self = new ListMigrationsResponse();
        return TeaModel.build(map, self);
    }

    public ListMigrationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMigrationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMigrationsResponse setBody(ListMigrationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMigrationsResponseBody getBody() {
        return this.body;
    }

}
