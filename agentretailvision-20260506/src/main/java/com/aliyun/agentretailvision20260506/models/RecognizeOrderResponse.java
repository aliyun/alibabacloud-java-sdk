// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentretailvision20260506.models;

import com.aliyun.tea.*;

public class RecognizeOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeOrderResponseBody body;

    public static RecognizeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeOrderResponse self = new RecognizeOrderResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeOrderResponse setBody(RecognizeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeOrderResponseBody getBody() {
        return this.body;
    }

}
