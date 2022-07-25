// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxRecoveryTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSandboxRecoveryTimeResponseBody body;

    public static DescribeSandboxRecoveryTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxRecoveryTimeResponse self = new DescribeSandboxRecoveryTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxRecoveryTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSandboxRecoveryTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSandboxRecoveryTimeResponse setBody(DescribeSandboxRecoveryTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSandboxRecoveryTimeResponseBody getBody() {
        return this.body;
    }

}
