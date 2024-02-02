// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SpeechByCombinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SpeechByCombinationResponseBody body;

    public static SpeechByCombinationResponse build(java.util.Map<String, ?> map) throws Exception {
        SpeechByCombinationResponse self = new SpeechByCombinationResponse();
        return TeaModel.build(map, self);
    }

    public SpeechByCombinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SpeechByCombinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SpeechByCombinationResponse setBody(SpeechByCombinationResponseBody body) {
        this.body = body;
        return this;
    }
    public SpeechByCombinationResponseBody getBody() {
        return this.body;
    }

}
