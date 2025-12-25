// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListThreadsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListThreadsResponseBody body;

    public static ListThreadsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListThreadsResponse self = new ListThreadsResponse();
        return TeaModel.build(map, self);
    }

    public ListThreadsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListThreadsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListThreadsResponse setBody(ListThreadsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListThreadsResponseBody getBody() {
        return this.body;
    }

}
