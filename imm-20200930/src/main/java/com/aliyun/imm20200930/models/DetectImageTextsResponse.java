// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageTextsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectImageTextsResponseBody body;

    public static DetectImageTextsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageTextsResponse self = new DetectImageTextsResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageTextsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageTextsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectImageTextsResponse setBody(DetectImageTextsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageTextsResponseBody getBody() {
        return this.body;
    }

}
