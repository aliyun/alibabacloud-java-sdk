// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageLogosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageLogosResponseBody body;

    public static DetectImageLogosResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageLogosResponse self = new DetectImageLogosResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageLogosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageLogosResponse setBody(DetectImageLogosResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageLogosResponseBody getBody() {
        return this.body;
    }

}
