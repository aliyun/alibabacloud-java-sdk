// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CancelDeletionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelDeletionResponseBody body;

    public static CancelDeletionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDeletionResponse self = new CancelDeletionResponse();
        return TeaModel.build(map, self);
    }

    public CancelDeletionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDeletionResponse setBody(CancelDeletionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDeletionResponseBody getBody() {
        return this.body;
    }

}
