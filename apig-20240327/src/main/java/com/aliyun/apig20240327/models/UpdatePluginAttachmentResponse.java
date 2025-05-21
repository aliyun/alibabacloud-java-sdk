// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdatePluginAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePluginAttachmentResponseBody body;

    public static UpdatePluginAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePluginAttachmentResponse self = new UpdatePluginAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePluginAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePluginAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePluginAttachmentResponse setBody(UpdatePluginAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePluginAttachmentResponseBody getBody() {
        return this.body;
    }

}
