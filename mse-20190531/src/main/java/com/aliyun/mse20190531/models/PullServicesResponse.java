// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class PullServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PullServicesResponseBody body;

    public static PullServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        PullServicesResponse self = new PullServicesResponse();
        return TeaModel.build(map, self);
    }

    public PullServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PullServicesResponse setBody(PullServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public PullServicesResponseBody getBody() {
        return this.body;
    }

}
