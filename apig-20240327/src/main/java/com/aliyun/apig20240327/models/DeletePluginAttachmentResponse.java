// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeletePluginAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePluginAttachmentResponseBody body;

    public static DeletePluginAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginAttachmentResponse self = new DeletePluginAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public DeletePluginAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePluginAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePluginAttachmentResponse setBody(DeletePluginAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePluginAttachmentResponseBody getBody() {
        return this.body;
    }

}
