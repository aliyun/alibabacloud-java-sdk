// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserPasswordPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserPasswordPolicyResponseBody body;

    public static GetUserPasswordPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserPasswordPolicyResponse self = new GetUserPasswordPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetUserPasswordPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserPasswordPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserPasswordPolicyResponse setBody(GetUserPasswordPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserPasswordPolicyResponseBody getBody() {
        return this.body;
    }

}
