// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAutoClipsTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoClipsTaskResponseBody body;

    public static ListAutoClipsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoClipsTaskResponse self = new ListAutoClipsTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoClipsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoClipsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoClipsTaskResponse setBody(ListAutoClipsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoClipsTaskResponseBody getBody() {
        return this.body;
    }

}
