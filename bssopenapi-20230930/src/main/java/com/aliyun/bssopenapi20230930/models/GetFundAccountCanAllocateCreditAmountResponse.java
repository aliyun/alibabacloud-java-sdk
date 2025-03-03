// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanAllocateCreditAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFundAccountCanAllocateCreditAmountResponseBody body;

    public static GetFundAccountCanAllocateCreditAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanAllocateCreditAmountResponse self = new GetFundAccountCanAllocateCreditAmountResponse();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanAllocateCreditAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFundAccountCanAllocateCreditAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFundAccountCanAllocateCreditAmountResponse setBody(GetFundAccountCanAllocateCreditAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFundAccountCanAllocateCreditAmountResponseBody getBody() {
        return this.body;
    }

}
