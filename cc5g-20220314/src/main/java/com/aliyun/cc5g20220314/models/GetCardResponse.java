// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardResponseBody body;

    public static GetCardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardResponse self = new GetCardResponse();
        return TeaModel.build(map, self);
    }

    public GetCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardResponse setBody(GetCardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardResponseBody getBody() {
        return this.body;
    }

}
