// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InstallAddonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallAddonResponseBody body;

    public static InstallAddonResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallAddonResponse self = new InstallAddonResponse();
        return TeaModel.build(map, self);
    }

    public InstallAddonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallAddonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallAddonResponse setBody(InstallAddonResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallAddonResponseBody getBody() {
        return this.body;
    }

}
