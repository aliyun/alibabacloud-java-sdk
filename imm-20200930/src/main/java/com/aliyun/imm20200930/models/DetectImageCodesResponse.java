// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetectImageCodesResponseBody body;

    public static DetectImageCodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCodesResponse self = new DetectImageCodesResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageCodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageCodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectImageCodesResponse setBody(DetectImageCodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageCodesResponseBody getBody() {
        return this.body;
    }

}
