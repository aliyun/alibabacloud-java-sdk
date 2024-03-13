// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BlurFaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BlurFaceResponseBody body;

    public static BlurFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        BlurFaceResponse self = new BlurFaceResponse();
        return TeaModel.build(map, self);
    }

    public BlurFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BlurFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BlurFaceResponse setBody(BlurFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public BlurFaceResponseBody getBody() {
        return this.body;
    }

}
