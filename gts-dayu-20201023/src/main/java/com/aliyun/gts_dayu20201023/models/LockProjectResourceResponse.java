// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class LockProjectResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LockProjectResourceResponseBody body;

    public static LockProjectResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        LockProjectResourceResponse self = new LockProjectResourceResponse();
        return TeaModel.build(map, self);
    }

    public LockProjectResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LockProjectResourceResponse setBody(LockProjectResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public LockProjectResourceResponseBody getBody() {
        return this.body;
    }

}
