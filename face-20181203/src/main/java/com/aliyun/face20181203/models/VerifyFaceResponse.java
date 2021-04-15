// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class VerifyFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyFaceResponseBody body;

    public static VerifyFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyFaceResponse self = new VerifyFaceResponse();
        return TeaModel.build(map, self);
    }

    public VerifyFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyFaceResponse setBody(VerifyFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyFaceResponseBody getBody() {
        return this.body;
    }

}
