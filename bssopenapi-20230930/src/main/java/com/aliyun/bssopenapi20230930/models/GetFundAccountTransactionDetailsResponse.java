// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountTransactionDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFundAccountTransactionDetailsResponseBody body;

    public static GetFundAccountTransactionDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountTransactionDetailsResponse self = new GetFundAccountTransactionDetailsResponse();
        return TeaModel.build(map, self);
    }

    public GetFundAccountTransactionDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFundAccountTransactionDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFundAccountTransactionDetailsResponse setBody(GetFundAccountTransactionDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFundAccountTransactionDetailsResponseBody getBody() {
        return this.body;
    }

}
