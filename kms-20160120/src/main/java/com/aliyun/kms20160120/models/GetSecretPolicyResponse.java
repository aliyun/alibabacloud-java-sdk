// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetSecretPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecretPolicyResponseBody body;

    public static GetSecretPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecretPolicyResponse self = new GetSecretPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetSecretPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecretPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecretPolicyResponse setBody(GetSecretPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecretPolicyResponseBody getBody() {
        return this.body;
    }

}
