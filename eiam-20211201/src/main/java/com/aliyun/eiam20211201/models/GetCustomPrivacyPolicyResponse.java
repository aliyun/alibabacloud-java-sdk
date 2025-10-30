// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCustomPrivacyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomPrivacyPolicyResponseBody body;

    public static GetCustomPrivacyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomPrivacyPolicyResponse self = new GetCustomPrivacyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomPrivacyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomPrivacyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomPrivacyPolicyResponse setBody(GetCustomPrivacyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomPrivacyPolicyResponseBody getBody() {
        return this.body;
    }

}
