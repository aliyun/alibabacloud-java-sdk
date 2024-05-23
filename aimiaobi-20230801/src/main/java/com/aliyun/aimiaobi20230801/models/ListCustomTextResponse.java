// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListCustomTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomTextResponseBody body;

    public static ListCustomTextResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomTextResponse self = new ListCustomTextResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomTextResponse setBody(ListCustomTextResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomTextResponseBody getBody() {
        return this.body;
    }

}
