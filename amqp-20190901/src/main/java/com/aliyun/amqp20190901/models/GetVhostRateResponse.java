// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetVhostRateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVhostRateResponseBody body;

    public static GetVhostRateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVhostRateResponse self = new GetVhostRateResponse();
        return TeaModel.build(map, self);
    }

    public GetVhostRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVhostRateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVhostRateResponse setBody(GetVhostRateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVhostRateResponseBody getBody() {
        return this.body;
    }

}
