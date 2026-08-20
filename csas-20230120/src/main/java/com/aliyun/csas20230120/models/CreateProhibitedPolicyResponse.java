// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateProhibitedPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProhibitedPolicyResponseBody body;

    public static CreateProhibitedPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProhibitedPolicyResponse self = new CreateProhibitedPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateProhibitedPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProhibitedPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProhibitedPolicyResponse setBody(CreateProhibitedPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProhibitedPolicyResponseBody getBody() {
        return this.body;
    }

}
