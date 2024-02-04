// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageLabelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectImageLabelsResponseBody body;

    public static DetectImageLabelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageLabelsResponse self = new DetectImageLabelsResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageLabelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageLabelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectImageLabelsResponse setBody(DetectImageLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageLabelsResponseBody getBody() {
        return this.body;
    }

}
