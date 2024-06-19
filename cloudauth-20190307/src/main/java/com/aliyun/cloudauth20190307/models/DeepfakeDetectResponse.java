// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeepfakeDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeepfakeDetectResponseBody body;

    public static DeepfakeDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectResponse self = new DeepfakeDetectResponse();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeepfakeDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeepfakeDetectResponse setBody(DeepfakeDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeepfakeDetectResponseBody getBody() {
        return this.body;
    }

}
