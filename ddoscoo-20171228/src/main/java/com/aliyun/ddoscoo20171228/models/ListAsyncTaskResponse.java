// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ListAsyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAsyncTaskResponseBody body;

    public static ListAsyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTaskResponse self = new ListAsyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListAsyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAsyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAsyncTaskResponse setBody(ListAsyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAsyncTaskResponseBody getBody() {
        return this.body;
    }

}
