// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnInstallClusterAddonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnInstallClusterAddonsResponseBody body;

    public static UnInstallClusterAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        UnInstallClusterAddonsResponse self = new UnInstallClusterAddonsResponse();
        return TeaModel.build(map, self);
    }

    public UnInstallClusterAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnInstallClusterAddonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnInstallClusterAddonsResponse setBody(UnInstallClusterAddonsResponseBody body) {
        this.body = body;
        return this;
    }
    public UnInstallClusterAddonsResponseBody getBody() {
        return this.body;
    }

}
