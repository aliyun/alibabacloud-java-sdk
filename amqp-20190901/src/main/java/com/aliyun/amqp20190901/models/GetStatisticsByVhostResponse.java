// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetStatisticsByVhostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStatisticsByVhostResponseBody body;

    public static GetStatisticsByVhostResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsByVhostResponse self = new GetStatisticsByVhostResponse();
        return TeaModel.build(map, self);
    }

    public GetStatisticsByVhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStatisticsByVhostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStatisticsByVhostResponse setBody(GetStatisticsByVhostResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStatisticsByVhostResponseBody getBody() {
        return this.body;
    }

}
