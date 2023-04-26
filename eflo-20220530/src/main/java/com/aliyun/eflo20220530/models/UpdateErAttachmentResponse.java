// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateErAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateErAttachmentResponseBody body;

    public static UpdateErAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateErAttachmentResponse self = new UpdateErAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateErAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateErAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateErAttachmentResponse setBody(UpdateErAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateErAttachmentResponseBody getBody() {
        return this.body;
    }

}
