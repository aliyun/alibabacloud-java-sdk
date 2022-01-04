// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UnLockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnLockResponseBody body;

    public static UnLockResponse build(java.util.Map<String, ?> map) throws Exception {
        UnLockResponse self = new UnLockResponse();
        return TeaModel.build(map, self);
    }

    public UnLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnLockResponse setBody(UnLockResponseBody body) {
        this.body = body;
        return this;
    }
    public UnLockResponseBody getBody() {
        return this.body;
    }

}
