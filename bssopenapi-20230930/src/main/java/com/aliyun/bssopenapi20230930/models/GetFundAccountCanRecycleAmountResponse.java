// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountCanRecycleAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFundAccountCanRecycleAmountResponseBody body;

    public static GetFundAccountCanRecycleAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountCanRecycleAmountResponse self = new GetFundAccountCanRecycleAmountResponse();
        return TeaModel.build(map, self);
    }

    public GetFundAccountCanRecycleAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFundAccountCanRecycleAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFundAccountCanRecycleAmountResponse setBody(GetFundAccountCanRecycleAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFundAccountCanRecycleAmountResponseBody getBody() {
        return this.body;
    }

}
