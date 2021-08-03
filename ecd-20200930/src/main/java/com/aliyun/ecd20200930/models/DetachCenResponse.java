// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DetachCenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachCenResponseBody body;

    public static DetachCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachCenResponse self = new DetachCenResponse();
        return TeaModel.build(map, self);
    }

    public DetachCenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachCenResponse setBody(DetachCenResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachCenResponseBody getBody() {
        return this.body;
    }

}
