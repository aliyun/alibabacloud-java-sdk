// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotTopicsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotTopicsResponseBody body;

    public static ListHotTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotTopicsResponse self = new ListHotTopicsResponse();
        return TeaModel.build(map, self);
    }

    public ListHotTopicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotTopicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotTopicsResponse setBody(ListHotTopicsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotTopicsResponseBody getBody() {
        return this.body;
    }

}
