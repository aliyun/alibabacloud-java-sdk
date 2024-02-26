// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradeInstanceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeInstanceVersionResponseBody body;

    public static UpgradeInstanceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInstanceVersionResponse self = new UpgradeInstanceVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeInstanceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeInstanceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeInstanceVersionResponse setBody(UpgradeInstanceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeInstanceVersionResponseBody getBody() {
        return this.body;
    }

}
