// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class CreateFundAccountTransferResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFundAccountTransferResponseBody body;

    public static CreateFundAccountTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFundAccountTransferResponse self = new CreateFundAccountTransferResponse();
        return TeaModel.build(map, self);
    }

    public CreateFundAccountTransferResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFundAccountTransferResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFundAccountTransferResponse setBody(CreateFundAccountTransferResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFundAccountTransferResponseBody getBody() {
        return this.body;
    }

}
