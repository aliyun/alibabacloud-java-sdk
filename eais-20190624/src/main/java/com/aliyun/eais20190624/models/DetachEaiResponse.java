// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DetachEaiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachEaiResponseBody body;

    public static DetachEaiResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachEaiResponse self = new DetachEaiResponse();
        return TeaModel.build(map, self);
    }

    public DetachEaiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachEaiResponse setBody(DetachEaiResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachEaiResponseBody getBody() {
        return this.body;
    }

}
