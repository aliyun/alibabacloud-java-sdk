// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCustomPrivacyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomPrivacyPolicyResponseBody body;

    public static UpdateCustomPrivacyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomPrivacyPolicyResponse self = new UpdateCustomPrivacyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomPrivacyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomPrivacyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomPrivacyPolicyResponse setBody(UpdateCustomPrivacyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomPrivacyPolicyResponseBody getBody() {
        return this.body;
    }

}
