// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class InstallClusterAddonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallClusterAddonsResponseBody body;

    public static InstallClusterAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallClusterAddonsResponse self = new InstallClusterAddonsResponse();
        return TeaModel.build(map, self);
    }

    public InstallClusterAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallClusterAddonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallClusterAddonsResponse setBody(InstallClusterAddonsResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallClusterAddonsResponseBody getBody() {
        return this.body;
    }

}
