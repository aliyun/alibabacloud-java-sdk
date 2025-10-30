// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCustomPrivacyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomPrivacyPolicyResponseBody body;

    public static DeleteCustomPrivacyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomPrivacyPolicyResponse self = new DeleteCustomPrivacyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomPrivacyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomPrivacyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomPrivacyPolicyResponse setBody(DeleteCustomPrivacyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomPrivacyPolicyResponseBody getBody() {
        return this.body;
    }

}
