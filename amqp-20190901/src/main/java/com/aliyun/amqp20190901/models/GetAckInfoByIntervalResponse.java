// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetAckInfoByIntervalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAckInfoByIntervalResponseBody body;

    public static GetAckInfoByIntervalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAckInfoByIntervalResponse self = new GetAckInfoByIntervalResponse();
        return TeaModel.build(map, self);
    }

    public GetAckInfoByIntervalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAckInfoByIntervalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAckInfoByIntervalResponse setBody(GetAckInfoByIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAckInfoByIntervalResponseBody getBody() {
        return this.body;
    }

}
