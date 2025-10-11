// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeepfakeDetectIntlStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeepfakeDetectIntlStreamResponseBody body;

    public static DeepfakeDetectIntlStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectIntlStreamResponse self = new DeepfakeDetectIntlStreamResponse();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectIntlStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeepfakeDetectIntlStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeepfakeDetectIntlStreamResponse setBody(DeepfakeDetectIntlStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeepfakeDetectIntlStreamResponseBody getBody() {
        return this.body;
    }

}
