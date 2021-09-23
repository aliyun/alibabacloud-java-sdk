// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageLabelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DetectImageLabelsResponse setBody(DetectImageLabelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageLabelsResponseBody getBody() {
        return this.body;
    }

}
