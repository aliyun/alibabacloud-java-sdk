// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanWithdrawAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFundAccountCanWithdrawAmountResponseBody body;

    public static GetFundAccountCanWithdrawAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanWithdrawAmountResponse self = new GetFundAccountCanWithdrawAmountResponse();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanWithdrawAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFundAccountCanWithdrawAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFundAccountCanWithdrawAmountResponse setBody(GetFundAccountCanWithdrawAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFundAccountCanWithdrawAmountResponseBody getBody() {
        return this.body;
    }

}
