// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectKneeKeypointXRayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectKneeKeypointXRayResponseBody body;

    public static DetectKneeKeypointXRayResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectKneeKeypointXRayResponse self = new DetectKneeKeypointXRayResponse();
        return TeaModel.build(map, self);
    }

    public DetectKneeKeypointXRayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectKneeKeypointXRayResponse setBody(DetectKneeKeypointXRayResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectKneeKeypointXRayResponseBody getBody() {
        return this.body;
    }

}
