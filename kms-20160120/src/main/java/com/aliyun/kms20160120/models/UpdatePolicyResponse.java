// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdatePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePolicyResponseBody body;

    public static UpdatePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePolicyResponse self = new UpdatePolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePolicyResponse setBody(UpdatePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePolicyResponseBody getBody() {
        return this.body;
    }

}
