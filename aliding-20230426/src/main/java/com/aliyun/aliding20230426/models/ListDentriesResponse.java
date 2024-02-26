// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListDentriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDentriesResponseBody body;

    public static ListDentriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDentriesResponse self = new ListDentriesResponse();
        return TeaModel.build(map, self);
    }

    public ListDentriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDentriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDentriesResponse setBody(ListDentriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDentriesResponseBody getBody() {
        return this.body;
    }

}
