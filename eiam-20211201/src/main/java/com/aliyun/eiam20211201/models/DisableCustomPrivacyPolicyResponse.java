// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableCustomPrivacyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableCustomPrivacyPolicyResponseBody body;

    public static DisableCustomPrivacyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableCustomPrivacyPolicyResponse self = new DisableCustomPrivacyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DisableCustomPrivacyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableCustomPrivacyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableCustomPrivacyPolicyResponse setBody(DisableCustomPrivacyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableCustomPrivacyPolicyResponseBody getBody() {
        return this.body;
    }

}
