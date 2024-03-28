// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class CloseUserIntentionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseUserIntentionResponseBody body;

    public static CloseUserIntentionResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseUserIntentionResponse self = new CloseUserIntentionResponse();
        return TeaModel.build(map, self);
    }

    public CloseUserIntentionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseUserIntentionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseUserIntentionResponse setBody(CloseUserIntentionResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseUserIntentionResponseBody getBody() {
        return this.body;
    }

}
