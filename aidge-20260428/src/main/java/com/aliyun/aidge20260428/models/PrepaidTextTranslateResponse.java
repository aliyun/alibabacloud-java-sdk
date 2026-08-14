// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class PrepaidTextTranslateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PrepaidTextTranslateResponseBody body;

    public static PrepaidTextTranslateResponse build(java.util.Map<String, ?> map) throws Exception {
        PrepaidTextTranslateResponse self = new PrepaidTextTranslateResponse();
        return TeaModel.build(map, self);
    }

    public PrepaidTextTranslateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PrepaidTextTranslateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PrepaidTextTranslateResponse setBody(PrepaidTextTranslateResponseBody body) {
        this.body = body;
        return this;
    }
    public PrepaidTextTranslateResponseBody getBody() {
        return this.body;
    }

}
