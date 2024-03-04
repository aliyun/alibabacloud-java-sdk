// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListDialoguesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDialoguesResponseBody body;

    public static ListDialoguesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDialoguesResponse self = new ListDialoguesResponse();
        return TeaModel.build(map, self);
    }

    public ListDialoguesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDialoguesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDialoguesResponse setBody(ListDialoguesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDialoguesResponseBody getBody() {
        return this.body;
    }

}
