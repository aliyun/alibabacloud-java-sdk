// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BlurFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BlurFaceResponse setBody(BlurFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public BlurFaceResponseBody getBody() {
        return this.body;
    }

}
