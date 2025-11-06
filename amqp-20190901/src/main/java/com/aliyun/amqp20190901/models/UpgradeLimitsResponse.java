// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class UpgradeLimitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpgradeLimitsResponseBody body;

    public static UpgradeLimitsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeLimitsResponse self = new UpgradeLimitsResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeLimitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeLimitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeLimitsResponse setBody(UpgradeLimitsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeLimitsResponseBody getBody() {
        return this.body;
    }

}
