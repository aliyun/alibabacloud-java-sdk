// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectHipKeypointXRayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectHipKeypointXRayResponseBody body;

    public static DetectHipKeypointXRayResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectHipKeypointXRayResponse self = new DetectHipKeypointXRayResponse();
        return TeaModel.build(map, self);
    }

    public DetectHipKeypointXRayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectHipKeypointXRayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectHipKeypointXRayResponse setBody(DetectHipKeypointXRayResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectHipKeypointXRayResponseBody getBody() {
        return this.body;
    }

}
