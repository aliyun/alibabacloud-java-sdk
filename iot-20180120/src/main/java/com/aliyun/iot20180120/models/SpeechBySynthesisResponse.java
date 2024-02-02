// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SpeechBySynthesisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SpeechBySynthesisResponseBody body;

    public static SpeechBySynthesisResponse build(java.util.Map<String, ?> map) throws Exception {
        SpeechBySynthesisResponse self = new SpeechBySynthesisResponse();
        return TeaModel.build(map, self);
    }

    public SpeechBySynthesisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SpeechBySynthesisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SpeechBySynthesisResponse setBody(SpeechBySynthesisResponseBody body) {
        this.body = body;
        return this;
    }
    public SpeechBySynthesisResponseBody getBody() {
        return this.body;
    }

}
