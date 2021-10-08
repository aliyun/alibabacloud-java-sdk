// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutDiagInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PutDiagInfoResponseBody body;

    public static PutDiagInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDiagInfoResponse self = new PutDiagInfoResponse();
        return TeaModel.build(map, self);
    }

    public PutDiagInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDiagInfoResponse setBody(PutDiagInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDiagInfoResponseBody getBody() {
        return this.body;
    }

}
