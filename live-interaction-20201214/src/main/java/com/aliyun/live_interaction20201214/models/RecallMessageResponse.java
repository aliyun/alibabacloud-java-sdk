// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RecallMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecallMessageResponseBody body;

    public static RecallMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecallMessageResponse self = new RecallMessageResponse();
        return TeaModel.build(map, self);
    }

    public RecallMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecallMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecallMessageResponse setBody(RecallMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecallMessageResponseBody getBody() {
        return this.body;
    }

}
