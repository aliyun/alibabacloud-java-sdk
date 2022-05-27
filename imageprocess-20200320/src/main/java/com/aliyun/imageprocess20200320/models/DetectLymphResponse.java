// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectLymphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectLymphResponseBody body;

    public static DetectLymphResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectLymphResponse self = new DetectLymphResponse();
        return TeaModel.build(map, self);
    }

    public DetectLymphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectLymphResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectLymphResponse setBody(DetectLymphResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectLymphResponseBody getBody() {
        return this.body;
    }

}
