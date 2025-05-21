// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPluginAttachmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPluginAttachmentResponseBody body;

    public static GetPluginAttachmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPluginAttachmentResponse self = new GetPluginAttachmentResponse();
        return TeaModel.build(map, self);
    }

    public GetPluginAttachmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPluginAttachmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPluginAttachmentResponse setBody(GetPluginAttachmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPluginAttachmentResponseBody getBody() {
        return this.body;
    }

}
