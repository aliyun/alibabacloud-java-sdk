// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetSSETestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSSETestResponseBody body;

    public static GetSSETestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSSETestResponse self = new GetSSETestResponse();
        return TeaModel.build(map, self);
    }

    public GetSSETestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSSETestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSSETestResponse setBody(GetSSETestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSSETestResponseBody getBody() {
        return this.body;
    }

}
