// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CancelKeyDeletionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelKeyDeletionResponseBody body;

    public static CancelKeyDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelKeyDeletionResponse self = new CancelKeyDeletionResponse();
        return TeaModel.build(map, self);
    }

    public CancelKeyDeletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelKeyDeletionResponse setBody(CancelKeyDeletionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelKeyDeletionResponseBody getBody() {
        return this.body;
    }

}
