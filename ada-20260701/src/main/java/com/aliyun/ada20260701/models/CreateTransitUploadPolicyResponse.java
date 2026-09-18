// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ada20260701.models;

import com.aliyun.tea.*;

public class CreateTransitUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitUploadPolicyResponseBody body;

    public static CreateTransitUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitUploadPolicyResponse self = new CreateTransitUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitUploadPolicyResponse setBody(CreateTransitUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
