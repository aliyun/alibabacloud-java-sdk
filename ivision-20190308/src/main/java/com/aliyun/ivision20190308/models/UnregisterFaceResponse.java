// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class UnregisterFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterFaceResponseBody body;

    public static UnregisterFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterFaceResponse self = new UnregisterFaceResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterFaceResponse setBody(UnregisterFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterFaceResponseBody getBody() {
        return this.body;
    }

}
