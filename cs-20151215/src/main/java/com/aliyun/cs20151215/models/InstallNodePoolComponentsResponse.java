// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InstallNodePoolComponentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallNodePoolComponentsResponseBody body;

    public static InstallNodePoolComponentsResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallNodePoolComponentsResponse self = new InstallNodePoolComponentsResponse();
        return TeaModel.build(map, self);
    }

    public InstallNodePoolComponentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallNodePoolComponentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallNodePoolComponentsResponse setBody(InstallNodePoolComponentsResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallNodePoolComponentsResponseBody getBody() {
        return this.body;
    }

}
