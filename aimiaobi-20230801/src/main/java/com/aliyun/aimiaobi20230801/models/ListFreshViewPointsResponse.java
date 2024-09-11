// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListFreshViewPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFreshViewPointsResponseBody body;

    public static ListFreshViewPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFreshViewPointsResponse self = new ListFreshViewPointsResponse();
        return TeaModel.build(map, self);
    }

    public ListFreshViewPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFreshViewPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFreshViewPointsResponse setBody(ListFreshViewPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFreshViewPointsResponseBody getBody() {
        return this.body;
    }

}
