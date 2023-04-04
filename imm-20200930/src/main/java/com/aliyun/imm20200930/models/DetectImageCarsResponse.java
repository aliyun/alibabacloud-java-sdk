// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCarsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageCarsResponseBody body;

    public static DetectImageCarsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCarsResponse self = new DetectImageCarsResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageCarsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageCarsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectImageCarsResponse setBody(DetectImageCarsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageCarsResponseBody getBody() {
        return this.body;
    }

}
