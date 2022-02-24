// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetGeneralTaxpayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGeneralTaxpayerResponseBody body;

    public static GetGeneralTaxpayerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGeneralTaxpayerResponse self = new GetGeneralTaxpayerResponse();
        return TeaModel.build(map, self);
    }

    public GetGeneralTaxpayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGeneralTaxpayerResponse setBody(GetGeneralTaxpayerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGeneralTaxpayerResponseBody getBody() {
        return this.body;
    }

}
