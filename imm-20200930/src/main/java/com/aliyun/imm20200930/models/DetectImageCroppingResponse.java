// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCroppingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageCroppingResponseBody body;

    public static DetectImageCroppingResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCroppingResponse self = new DetectImageCroppingResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageCroppingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageCroppingResponse setBody(DetectImageCroppingResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageCroppingResponseBody getBody() {
        return this.body;
    }

}
