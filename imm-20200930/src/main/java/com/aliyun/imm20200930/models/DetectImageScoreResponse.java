// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageScoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageScoreResponseBody body;

    public static DetectImageScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageScoreResponse self = new DetectImageScoreResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageScoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageScoreResponse setBody(DetectImageScoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageScoreResponseBody getBody() {
        return this.body;
    }

}
