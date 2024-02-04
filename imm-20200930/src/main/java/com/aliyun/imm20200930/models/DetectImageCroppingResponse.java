// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCroppingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectImageCroppingResponseBody body;

    public static DetectImageCroppingResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCroppingResponse self = new DetectImageCroppingResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageCroppingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageCroppingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectImageCroppingResponse setBody(DetectImageCroppingResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageCroppingResponseBody getBody() {
        return this.body;
    }

}
