// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ListDatabaseDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatabaseDetailsResponseBody body;

    public static ListDatabaseDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseDetailsResponse self = new ListDatabaseDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabaseDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabaseDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabaseDetailsResponse setBody(ListDatabaseDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabaseDetailsResponseBody getBody() {
        return this.body;
    }

}
