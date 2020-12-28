// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePostPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpgradePostPayOrderResponse setBody(UpgradePostPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradePostPayOrderResponseBody getBody() {
        return this.body;
    }

}
