// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradePrePayOrderResponseBody body;

    public static UpgradePrePayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradePrePayOrderResponse self = new UpgradePrePayOrderResponse();
        return TeaModel.build(map, self);
    }

    public UpgradePrePayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradePrePayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradePrePayOrderResponse setBody(UpgradePrePayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePrePayOrderResponseBody getBody() {
        return this.body;
    }

}
