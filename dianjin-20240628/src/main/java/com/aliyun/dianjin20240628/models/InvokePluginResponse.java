// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class InvokePluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokePluginResponseBody body;

    public static InvokePluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokePluginResponse self = new InvokePluginResponse();
        return TeaModel.build(map, self);
    }

    public InvokePluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokePluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokePluginResponse setBody(InvokePluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokePluginResponseBody getBody() {
        return this.body;
    }

}
