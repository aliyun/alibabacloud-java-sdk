// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpgradeClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeClusterResponseBody body;

    public static UpgradeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterResponse self = new UpgradeClusterResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeClusterResponse setBody(UpgradeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeClusterResponseBody getBody() {
        return this.body;
    }

}
