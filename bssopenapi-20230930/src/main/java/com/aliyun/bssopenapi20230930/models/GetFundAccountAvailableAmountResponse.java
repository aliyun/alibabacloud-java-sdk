// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountAvailableAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFundAccountAvailableAmountResponseBody body;

    public static GetFundAccountAvailableAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountAvailableAmountResponse self = new GetFundAccountAvailableAmountResponse();
        return TeaModel.build(map, self);
    }

    public GetFundAccountAvailableAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFundAccountAvailableAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFundAccountAvailableAmountResponse setBody(GetFundAccountAvailableAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFundAccountAvailableAmountResponseBody getBody() {
        return this.body;
    }

}
