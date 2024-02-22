// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class AIGCFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AIGCFaceVerifyResponseBody body;

    public static AIGCFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        AIGCFaceVerifyResponse self = new AIGCFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public AIGCFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AIGCFaceVerifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AIGCFaceVerifyResponse setBody(AIGCFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public AIGCFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
