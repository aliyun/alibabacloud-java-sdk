// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetExchangeErrorByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExchangeErrorByTaskIdResponseBody body;

    public static GetExchangeErrorByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExchangeErrorByTaskIdResponse self = new GetExchangeErrorByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetExchangeErrorByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExchangeErrorByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExchangeErrorByTaskIdResponse setBody(GetExchangeErrorByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExchangeErrorByTaskIdResponseBody getBody() {
        return this.body;
    }

}
