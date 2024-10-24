// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCardSmsDetailsResponseBody body;

    public static GetCardSmsDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCardSmsDetailsResponse self = new GetCardSmsDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetCardSmsDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCardSmsDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCardSmsDetailsResponse setBody(GetCardSmsDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCardSmsDetailsResponseBody getBody() {
        return this.body;
    }

}
