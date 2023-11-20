// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterChecksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterChecksResponseBody body;

    public static ListClusterChecksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterChecksResponse self = new ListClusterChecksResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterChecksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterChecksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterChecksResponse setBody(ListClusterChecksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterChecksResponseBody getBody() {
        return this.body;
    }

}
