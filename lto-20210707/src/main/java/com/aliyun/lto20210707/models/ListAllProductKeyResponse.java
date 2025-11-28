// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListAllProductKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllProductKeyResponseBody body;

    public static ListAllProductKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllProductKeyResponse self = new ListAllProductKeyResponse();
        return TeaModel.build(map, self);
    }

    public ListAllProductKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllProductKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllProductKeyResponse setBody(ListAllProductKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllProductKeyResponseBody getBody() {
        return this.body;
    }

}
