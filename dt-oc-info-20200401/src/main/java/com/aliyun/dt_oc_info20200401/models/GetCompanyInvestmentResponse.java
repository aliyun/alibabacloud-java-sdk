// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyInvestmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCompanyInvestmentResponseBody body;

    public static GetCompanyInvestmentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyInvestmentResponse self = new GetCompanyInvestmentResponse();
        return TeaModel.build(map, self);
    }

    public GetCompanyInvestmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompanyInvestmentResponse setBody(GetCompanyInvestmentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompanyInvestmentResponseBody getBody() {
        return this.body;
    }

}
