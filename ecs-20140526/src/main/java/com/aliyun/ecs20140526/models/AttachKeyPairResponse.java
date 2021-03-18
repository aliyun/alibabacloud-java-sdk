// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachKeyPairResponseBody body;

    public static AttachKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponse self = new AttachKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachKeyPairResponse setBody(AttachKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachKeyPairResponseBody getBody() {
        return this.body;
    }

}
