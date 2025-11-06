// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetTpsByTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTpsByTimeResponseBody body;

    public static GetTpsByTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTpsByTimeResponse self = new GetTpsByTimeResponse();
        return TeaModel.build(map, self);
    }

    public GetTpsByTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTpsByTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTpsByTimeResponse setBody(GetTpsByTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTpsByTimeResponseBody getBody() {
        return this.body;
    }

}
