// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PutRestorePreCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutRestorePreCheckResponseBody body;

    public static PutRestorePreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        PutRestorePreCheckResponse self = new PutRestorePreCheckResponse();
        return TeaModel.build(map, self);
    }

    public PutRestorePreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutRestorePreCheckResponse setBody(PutRestorePreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public PutRestorePreCheckResponseBody getBody() {
        return this.body;
    }

}
