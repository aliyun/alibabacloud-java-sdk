// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectTextAnomalyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectTextAnomalyResponseBody body;

    public static DetectTextAnomalyResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectTextAnomalyResponse self = new DetectTextAnomalyResponse();
        return TeaModel.build(map, self);
    }

    public DetectTextAnomalyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectTextAnomalyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectTextAnomalyResponse setBody(DetectTextAnomalyResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectTextAnomalyResponseBody getBody() {
        return this.body;
    }

}
