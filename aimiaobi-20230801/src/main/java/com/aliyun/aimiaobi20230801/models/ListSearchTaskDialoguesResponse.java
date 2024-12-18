// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTaskDialoguesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSearchTaskDialoguesResponseBody body;

    public static ListSearchTaskDialoguesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTaskDialoguesResponse self = new ListSearchTaskDialoguesResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchTaskDialoguesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchTaskDialoguesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSearchTaskDialoguesResponse setBody(ListSearchTaskDialoguesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchTaskDialoguesResponseBody getBody() {
        return this.body;
    }

}
