// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePostPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradePostPayOrderResponseBody body;

    public static UpgradePostPayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradePostPayOrderResponse self = new UpgradePostPayOrderResponse();
        return TeaModel.build(map, self);
    }

    public UpgradePostPayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradePostPayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradePostPayOrderResponse setBody(UpgradePostPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePostPayOrderResponseBody getBody() {
        return this.body;
    }

}
