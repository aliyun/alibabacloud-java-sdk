// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpgradeClusterAddonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeClusterAddonsResponseBody body;

    public static UpgradeClusterAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterAddonsResponse self = new UpgradeClusterAddonsResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeClusterAddonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeClusterAddonsResponse setBody(UpgradeClusterAddonsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeClusterAddonsResponseBody getBody() {
        return this.body;
    }

}
