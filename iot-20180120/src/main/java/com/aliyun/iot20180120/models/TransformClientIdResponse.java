// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class TransformClientIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransformClientIdResponseBody body;

    public static TransformClientIdResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformClientIdResponse self = new TransformClientIdResponse();
        return TeaModel.build(map, self);
    }

    public TransformClientIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformClientIdResponse setBody(TransformClientIdResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformClientIdResponseBody getBody() {
        return this.body;
    }

}
