// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectRibFractureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectRibFractureResponseBody body;

    public static DetectRibFractureResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectRibFractureResponse self = new DetectRibFractureResponse();
        return TeaModel.build(map, self);
    }

    public DetectRibFractureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectRibFractureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectRibFractureResponse setBody(DetectRibFractureResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectRibFractureResponseBody getBody() {
        return this.body;
    }

}
