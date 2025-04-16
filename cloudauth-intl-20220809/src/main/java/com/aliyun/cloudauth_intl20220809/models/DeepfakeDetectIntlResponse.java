// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeepfakeDetectIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeepfakeDetectIntlResponseBody body;

    public static DeepfakeDetectIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectIntlResponse self = new DeepfakeDetectIntlResponse();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeepfakeDetectIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeepfakeDetectIntlResponse setBody(DeepfakeDetectIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public DeepfakeDetectIntlResponseBody getBody() {
        return this.body;
    }

}
