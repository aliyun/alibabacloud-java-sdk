// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPluginClassResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPluginClassResponseBody body;

    public static GetPluginClassResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPluginClassResponse self = new GetPluginClassResponse();
        return TeaModel.build(map, self);
    }

    public GetPluginClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPluginClassResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPluginClassResponse setBody(GetPluginClassResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPluginClassResponseBody getBody() {
        return this.body;
    }

}
