// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVersionsResponseBody body;

    public static ListVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsResponse self = new ListVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVersionsResponse setBody(ListVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVersionsResponseBody getBody() {
        return this.body;
    }

}
