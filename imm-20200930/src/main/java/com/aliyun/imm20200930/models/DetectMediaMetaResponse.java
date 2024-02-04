// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectMediaMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectMediaMetaResponseBody body;

    public static DetectMediaMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectMediaMetaResponse self = new DetectMediaMetaResponse();
        return TeaModel.build(map, self);
    }

    public DetectMediaMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectMediaMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectMediaMetaResponse setBody(DetectMediaMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectMediaMetaResponseBody getBody() {
        return this.body;
    }

}
