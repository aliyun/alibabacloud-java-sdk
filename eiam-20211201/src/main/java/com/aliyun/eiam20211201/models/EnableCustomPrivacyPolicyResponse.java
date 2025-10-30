// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableCustomPrivacyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableCustomPrivacyPolicyResponseBody body;

    public static EnableCustomPrivacyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomPrivacyPolicyResponse self = new EnableCustomPrivacyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public EnableCustomPrivacyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableCustomPrivacyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableCustomPrivacyPolicyResponse setBody(EnableCustomPrivacyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableCustomPrivacyPolicyResponseBody getBody() {
        return this.body;
    }

}
