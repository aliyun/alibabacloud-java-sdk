// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanTransferAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFundAccountCanTransferAmountResponseBody body;

    public static GetFundAccountCanTransferAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanTransferAmountResponse self = new GetFundAccountCanTransferAmountResponse();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanTransferAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFundAccountCanTransferAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFundAccountCanTransferAmountResponse setBody(GetFundAccountCanTransferAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFundAccountCanTransferAmountResponseBody getBody() {
        return this.body;
    }

}
