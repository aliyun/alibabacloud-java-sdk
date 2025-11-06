// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ConsoleClearPretendStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConsoleClearPretendStatusResponseBody body;

    public static ConsoleClearPretendStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ConsoleClearPretendStatusResponse self = new ConsoleClearPretendStatusResponse();
        return TeaModel.build(map, self);
    }

    public ConsoleClearPretendStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConsoleClearPretendStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConsoleClearPretendStatusResponse setBody(ConsoleClearPretendStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ConsoleClearPretendStatusResponseBody getBody() {
        return this.body;
    }

}
