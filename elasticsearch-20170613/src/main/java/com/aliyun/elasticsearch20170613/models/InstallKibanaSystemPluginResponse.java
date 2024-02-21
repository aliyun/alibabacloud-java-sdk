// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallKibanaSystemPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallKibanaSystemPluginResponseBody body;

    public static InstallKibanaSystemPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallKibanaSystemPluginResponse self = new InstallKibanaSystemPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallKibanaSystemPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallKibanaSystemPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallKibanaSystemPluginResponse setBody(InstallKibanaSystemPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallKibanaSystemPluginResponseBody getBody() {
        return this.body;
    }

}
