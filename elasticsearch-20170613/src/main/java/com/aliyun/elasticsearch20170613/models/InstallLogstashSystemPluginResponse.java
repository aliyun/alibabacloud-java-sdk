// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallLogstashSystemPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallLogstashSystemPluginResponseBody body;

    public static InstallLogstashSystemPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallLogstashSystemPluginResponse self = new InstallLogstashSystemPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallLogstashSystemPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallLogstashSystemPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallLogstashSystemPluginResponse setBody(InstallLogstashSystemPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallLogstashSystemPluginResponseBody getBody() {
        return this.body;
    }

}
