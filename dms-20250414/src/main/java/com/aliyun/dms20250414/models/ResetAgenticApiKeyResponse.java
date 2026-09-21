// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ResetAgenticApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAgenticApiKeyResponseBody body;

    public static ResetAgenticApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAgenticApiKeyResponse self = new ResetAgenticApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ResetAgenticApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAgenticApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAgenticApiKeyResponse setBody(ResetAgenticApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAgenticApiKeyResponseBody getBody() {
        return this.body;
    }

}
