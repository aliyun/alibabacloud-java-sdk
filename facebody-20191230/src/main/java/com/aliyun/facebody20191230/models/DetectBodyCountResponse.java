// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectBodyCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectBodyCountResponseBody body;

    public static DetectBodyCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectBodyCountResponse self = new DetectBodyCountResponse();
        return TeaModel.build(map, self);
    }

    public DetectBodyCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectBodyCountResponse setBody(DetectBodyCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectBodyCountResponseBody getBody() {
        return this.body;
    }

}
