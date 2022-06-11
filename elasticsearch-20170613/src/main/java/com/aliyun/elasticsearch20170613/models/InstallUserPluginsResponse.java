// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InstallUserPluginsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InstallUserPluginsResponseBody body;

    public static InstallUserPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallUserPluginsResponse self = new InstallUserPluginsResponse();
        return TeaModel.build(map, self);
    }

    public InstallUserPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallUserPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallUserPluginsResponse setBody(InstallUserPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallUserPluginsResponseBody getBody() {
        return this.body;
    }

}
