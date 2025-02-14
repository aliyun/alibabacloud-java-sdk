// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeletePolicyAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolicyAttachmentResponseBody body;

    public static DeletePolicyAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyAttachmentResponse self = new DeletePolicyAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyAttachmentResponse setBody(DeletePolicyAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyAttachmentResponseBody getBody() {
        return this.body;
    }

}
