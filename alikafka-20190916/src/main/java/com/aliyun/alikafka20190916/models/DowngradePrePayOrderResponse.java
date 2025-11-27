// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DowngradePrePayOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DowngradePrePayOrderResponseBody body;

    public static DowngradePrePayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DowngradePrePayOrderResponse self = new DowngradePrePayOrderResponse();
        return TeaModel.build(map, self);
    }

    public DowngradePrePayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DowngradePrePayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DowngradePrePayOrderResponse setBody(DowngradePrePayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DowngradePrePayOrderResponseBody getBody() {
        return this.body;
    }

}
