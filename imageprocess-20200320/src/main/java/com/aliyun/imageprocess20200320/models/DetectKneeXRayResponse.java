// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeXRayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectKneeXRayResponseBody body;

    public static DetectKneeXRayResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeXRayResponse self = new DetectKneeXRayResponse();
        return TeaModel.build(map, self);
    }

    public DetectKneeXRayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectKneeXRayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectKneeXRayResponse setBody(DetectKneeXRayResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectKneeXRayResponseBody getBody() {
        return this.body;
    }

}
