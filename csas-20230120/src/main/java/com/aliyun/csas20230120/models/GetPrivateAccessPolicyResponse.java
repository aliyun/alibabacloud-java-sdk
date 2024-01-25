// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPrivateAccessPolicyResponseBody body;

    public static GetPrivateAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessPolicyResponse self = new GetPrivateAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPrivateAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPrivateAccessPolicyResponse setBody(GetPrivateAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
