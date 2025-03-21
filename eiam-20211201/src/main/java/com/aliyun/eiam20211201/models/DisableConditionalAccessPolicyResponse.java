// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableConditionalAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableConditionalAccessPolicyResponseBody body;

    public static DisableConditionalAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableConditionalAccessPolicyResponse self = new DisableConditionalAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DisableConditionalAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableConditionalAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableConditionalAccessPolicyResponse setBody(DisableConditionalAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableConditionalAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
