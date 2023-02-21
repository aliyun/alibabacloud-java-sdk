// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcInvestmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcIcInvestmentResponseBody body;

    public static GetOcIcInvestmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcInvestmentResponse self = new GetOcIcInvestmentResponse();
        return TeaModel.build(map, self);
    }

    public GetOcIcInvestmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcIcInvestmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcIcInvestmentResponse setBody(GetOcIcInvestmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcIcInvestmentResponseBody getBody() {
        return this.body;
    }

}
