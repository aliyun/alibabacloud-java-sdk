// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class DowngradePostPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DowngradePostPayOrderResponseBody body;

    public static DowngradePostPayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DowngradePostPayOrderResponse self = new DowngradePostPayOrderResponse();
        return TeaModel.build(map, self);
    }

    public DowngradePostPayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DowngradePostPayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DowngradePostPayOrderResponse setBody(DowngradePostPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DowngradePostPayOrderResponseBody getBody() {
        return this.body;
    }

}
