// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTaskDialogueDatasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSearchTaskDialogueDatasResponseBody body;

    public static ListSearchTaskDialogueDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTaskDialogueDatasResponse self = new ListSearchTaskDialogueDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListSearchTaskDialogueDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSearchTaskDialogueDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSearchTaskDialogueDatasResponse setBody(ListSearchTaskDialogueDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSearchTaskDialogueDatasResponseBody getBody() {
        return this.body;
    }

}
