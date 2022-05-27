// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectPancResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectPancResponseBody body;

    public static DetectPancResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectPancResponse self = new DetectPancResponse();
        return TeaModel.build(map, self);
    }

    public DetectPancResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectPancResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectPancResponse setBody(DetectPancResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectPancResponseBody getBody() {
        return this.body;
    }

}
