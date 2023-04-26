// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteErAttachmentResponseBody body;

    public static DeleteErAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteErAttachmentResponse self = new DeleteErAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteErAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteErAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteErAttachmentResponse setBody(DeleteErAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteErAttachmentResponseBody getBody() {
        return this.body;
    }

}
