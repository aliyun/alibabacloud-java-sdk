// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxGeneralTaxpayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcTaxGeneralTaxpayerResponseBody body;

    public static GetOcTaxGeneralTaxpayerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxGeneralTaxpayerResponse self = new GetOcTaxGeneralTaxpayerResponse();
        return TeaModel.build(map, self);
    }

    public GetOcTaxGeneralTaxpayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcTaxGeneralTaxpayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcTaxGeneralTaxpayerResponse setBody(GetOcTaxGeneralTaxpayerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcTaxGeneralTaxpayerResponseBody getBody() {
        return this.body;
    }

}
