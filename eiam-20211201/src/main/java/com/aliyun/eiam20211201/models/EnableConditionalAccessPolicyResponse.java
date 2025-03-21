// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableConditionalAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableConditionalAccessPolicyResponseBody body;

    public static EnableConditionalAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableConditionalAccessPolicyResponse self = new EnableConditionalAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public EnableConditionalAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableConditionalAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableConditionalAccessPolicyResponse setBody(EnableConditionalAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableConditionalAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
