// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxClassAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcTaxClassAResponseBody body;

    public static GetOcTaxClassAResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxClassAResponse self = new GetOcTaxClassAResponse();
        return TeaModel.build(map, self);
    }

    public GetOcTaxClassAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcTaxClassAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcTaxClassAResponse setBody(GetOcTaxClassAResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcTaxClassAResponseBody getBody() {
        return this.body;
    }

}
