// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallPluginResponseBody body;

    public static UninstallPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallPluginResponse self = new UninstallPluginResponse();
        return TeaModel.build(map, self);
    }

    public UninstallPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallPluginResponse setBody(UninstallPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallPluginResponseBody getBody() {
        return this.body;
    }

}
