// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetConsumerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConsumerResponseBody body;

    public static GetConsumerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerResponse self = new GetConsumerResponse();
        return TeaModel.build(map, self);
    }

    public GetConsumerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConsumerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConsumerResponse setBody(GetConsumerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConsumerResponseBody getBody() {
        return this.body;
    }

}
