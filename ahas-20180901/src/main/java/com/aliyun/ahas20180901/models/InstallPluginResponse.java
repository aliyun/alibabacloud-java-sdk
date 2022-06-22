// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class InstallPluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InstallPluginResponseBody body;

    public static InstallPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallPluginResponse self = new InstallPluginResponse();
        return TeaModel.build(map, self);
    }

    public InstallPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallPluginResponse setBody(InstallPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallPluginResponseBody getBody() {
        return this.body;
    }

}
