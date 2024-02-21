// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteILMPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteILMPolicyResponseBody body;

    public static DeleteILMPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteILMPolicyResponse self = new DeleteILMPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteILMPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteILMPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteILMPolicyResponse setBody(DeleteILMPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteILMPolicyResponseBody getBody() {
        return this.body;
    }

}
