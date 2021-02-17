// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageBodiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageBodiesResponseBody body;

    public static DetectImageBodiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageBodiesResponse self = new DetectImageBodiesResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageBodiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageBodiesResponse setBody(DetectImageBodiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageBodiesResponseBody getBody() {
        return this.body;
    }

}
