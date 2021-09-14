// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ResetDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetDbfsResponseBody body;

    public static ResetDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDbfsResponse self = new ResetDbfsResponse();
        return TeaModel.build(map, self);
    }

    public ResetDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDbfsResponse setBody(ResetDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDbfsResponseBody getBody() {
        return this.body;
    }

}
