// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRegistrationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRegistrationPolicyResponseBody body;

    public static UpdateRegistrationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistrationPolicyResponse self = new UpdateRegistrationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRegistrationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRegistrationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRegistrationPolicyResponse setBody(UpdateRegistrationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRegistrationPolicyResponseBody getBody() {
        return this.body;
    }

}
