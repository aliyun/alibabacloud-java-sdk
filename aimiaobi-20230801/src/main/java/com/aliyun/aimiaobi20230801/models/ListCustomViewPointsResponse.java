// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListCustomViewPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomViewPointsResponseBody body;

    public static ListCustomViewPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomViewPointsResponse self = new ListCustomViewPointsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomViewPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomViewPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomViewPointsResponse setBody(ListCustomViewPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomViewPointsResponseBody getBody() {
        return this.body;
    }

}
