// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateConditionalAccessPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConditionalAccessPolicyResponseBody body;

    public static UpdateConditionalAccessPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConditionalAccessPolicyResponse self = new UpdateConditionalAccessPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConditionalAccessPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConditionalAccessPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConditionalAccessPolicyResponse setBody(UpdateConditionalAccessPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConditionalAccessPolicyResponseBody getBody() {
        return this.body;
    }

}
