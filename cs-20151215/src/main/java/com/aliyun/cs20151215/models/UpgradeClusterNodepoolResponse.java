// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterNodepoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeClusterNodepoolResponseBody body;

    public static UpgradeClusterNodepoolResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterNodepoolResponse self = new UpgradeClusterNodepoolResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterNodepoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeClusterNodepoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeClusterNodepoolResponse setBody(UpgradeClusterNodepoolResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeClusterNodepoolResponseBody getBody() {
        return this.body;
    }

}
