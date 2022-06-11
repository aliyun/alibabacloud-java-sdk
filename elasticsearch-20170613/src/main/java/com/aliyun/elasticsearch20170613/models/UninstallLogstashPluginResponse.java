// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UninstallLogstashPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
