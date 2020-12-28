// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpgradePrePayOrderResponse setBody(UpgradePrePayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePrePayOrderResponseBody getBody() {
        return this.body;
    }

}
