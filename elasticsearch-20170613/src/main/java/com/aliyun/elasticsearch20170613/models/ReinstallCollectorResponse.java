// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ReinstallCollectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReinstallCollectorResponseBody body;

    public static ReinstallCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        ReinstallCollectorResponse self = new ReinstallCollectorResponse();
        return TeaModel.build(map, self);
    }

    public ReinstallCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReinstallCollectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReinstallCollectorResponse setBody(ReinstallCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public ReinstallCollectorResponseBody getBody() {
        return this.body;
    }

}
