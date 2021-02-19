// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class AttachEaiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachEaiResponseBody body;

    public static AttachEaiResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachEaiResponse self = new AttachEaiResponse();
        return TeaModel.build(map, self);
    }

    public AttachEaiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachEaiResponse setBody(AttachEaiResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachEaiResponseBody getBody() {
        return this.body;
    }

}
