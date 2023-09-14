// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetRegistrationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetRegistrationPolicyResponseBody body;

    public static GetRegistrationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRegistrationPolicyResponse self = new GetRegistrationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetRegistrationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRegistrationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRegistrationPolicyResponse setBody(GetRegistrationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRegistrationPolicyResponseBody getBody() {
        return this.body;
    }

}
