// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallLogstashPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallLogstashPluginResponseBody body;

    public static UninstallLogstashPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallLogstashPluginResponse self = new UninstallLogstashPluginResponse();
        return TeaModel.build(map, self);
    }

    public UninstallLogstashPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallLogstashPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallLogstashPluginResponse setBody(UninstallLogstashPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallLogstashPluginResponseBody getBody() {
        return this.body;
    }

}
