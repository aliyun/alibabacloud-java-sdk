// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class SetZeroCreditShutdownPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetZeroCreditShutdownPolicyResponseBody body;

    public static SetZeroCreditShutdownPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetZeroCreditShutdownPolicyResponse self = new SetZeroCreditShutdownPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetZeroCreditShutdownPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetZeroCreditShutdownPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetZeroCreditShutdownPolicyResponse setBody(SetZeroCreditShutdownPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetZeroCreditShutdownPolicyResponseBody getBody() {
        return this.body;
    }

}
