// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePrivateAccessPolicyResponseBody body;

    public static UpdatePrivateAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessPolicyResponse self = new UpdatePrivateAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePrivateAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePrivateAccessPolicyResponse setBody(UpdatePrivateAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
