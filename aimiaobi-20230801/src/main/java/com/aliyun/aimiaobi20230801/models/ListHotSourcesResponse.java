// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotSourcesResponseBody body;

    public static ListHotSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotSourcesResponse self = new ListHotSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListHotSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotSourcesResponse setBody(ListHotSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotSourcesResponseBody getBody() {
        return this.body;
    }

}
