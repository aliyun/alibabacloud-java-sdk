// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class DeletePluginClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePluginClassResponseBody body;

    public static DeletePluginClassResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePluginClassResponse self = new DeletePluginClassResponse();
        return TeaModel.build(map, self);
    }

    public DeletePluginClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePluginClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePluginClassResponse setBody(DeletePluginClassResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePluginClassResponseBody getBody() {
        return this.body;
    }

}
