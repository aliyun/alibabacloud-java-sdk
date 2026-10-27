// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ValidateAgentCodePackageFromOssResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateAgentCodePackageFromOssResponseBody body;

    public static ValidateAgentCodePackageFromOssResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateAgentCodePackageFromOssResponse self = new ValidateAgentCodePackageFromOssResponse();
        return TeaModel.build(map, self);
    }

    public ValidateAgentCodePackageFromOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateAgentCodePackageFromOssResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateAgentCodePackageFromOssResponse setBody(ValidateAgentCodePackageFromOssResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateAgentCodePackageFromOssResponseBody getBody() {
        return this.body;
    }

}
