// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePluginAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePluginAttachmentResponseBody body;

    public static CreatePluginAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePluginAttachmentResponse self = new CreatePluginAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public CreatePluginAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePluginAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePluginAttachmentResponse setBody(CreatePluginAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePluginAttachmentResponseBody getBody() {
        return this.body;
    }

}
