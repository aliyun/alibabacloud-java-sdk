// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePolicyAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePolicyAttachmentResponseBody body;

    public static CreatePolicyAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyAttachmentResponse self = new CreatePolicyAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreatePolicyAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePolicyAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePolicyAttachmentResponse setBody(CreatePolicyAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePolicyAttachmentResponseBody getBody() {
        return this.body;
    }

}
