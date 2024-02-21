// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateILMPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateILMPolicyResponseBody body;

    public static UpdateILMPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateILMPolicyResponse self = new UpdateILMPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateILMPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateILMPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateILMPolicyResponse setBody(UpdateILMPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateILMPolicyResponseBody getBody() {
        return this.body;
    }

}
