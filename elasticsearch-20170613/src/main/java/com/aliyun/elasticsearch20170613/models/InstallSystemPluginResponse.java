// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallSystemPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallSystemPluginResponseBody body;

    public static InstallSystemPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallSystemPluginResponse self = new InstallSystemPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallSystemPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallSystemPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallSystemPluginResponse setBody(InstallSystemPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallSystemPluginResponseBody getBody() {
        return this.body;
    }

}
