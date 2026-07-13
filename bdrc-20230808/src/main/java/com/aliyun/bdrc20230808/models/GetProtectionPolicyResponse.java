// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetProtectionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetProtectionPolicyResponseBody body;

    public static GetProtectionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProtectionPolicyResponse self = new GetProtectionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetProtectionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProtectionPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProtectionPolicyResponse setBody(GetProtectionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProtectionPolicyResponseBody getBody() {
        return this.body;
    }

}
