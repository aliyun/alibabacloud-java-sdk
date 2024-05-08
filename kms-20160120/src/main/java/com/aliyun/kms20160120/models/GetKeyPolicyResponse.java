// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetKeyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKeyPolicyResponseBody body;

    public static GetKeyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKeyPolicyResponse self = new GetKeyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetKeyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKeyPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKeyPolicyResponse setBody(GetKeyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKeyPolicyResponseBody getBody() {
        return this.body;
    }

}
