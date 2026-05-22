// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearchengine20260417.models;

import com.aliyun.tea.*;

public class QaChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QaChatResponseBody body;

    public static QaChatResponse build(java.util.Map<String, ?> map) throws Exception {
        QaChatResponse self = new QaChatResponse();
        return TeaModel.build(map, self);
    }

    public QaChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QaChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QaChatResponse setBody(QaChatResponseBody body) {
        this.body = body;
        return this;
    }
    public QaChatResponseBody getBody() {
        return this.body;
    }

}
