// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateErAttachmentResponseBody body;

    public static CreateErAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateErAttachmentResponse self = new CreateErAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreateErAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateErAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateErAttachmentResponse setBody(CreateErAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateErAttachmentResponseBody getBody() {
        return this.body;
    }

}
