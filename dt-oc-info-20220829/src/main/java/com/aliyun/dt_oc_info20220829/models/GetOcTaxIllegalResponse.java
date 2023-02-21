// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxIllegalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcTaxIllegalResponseBody body;

    public static GetOcTaxIllegalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxIllegalResponse self = new GetOcTaxIllegalResponse();
        return TeaModel.build(map, self);
    }

    public GetOcTaxIllegalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcTaxIllegalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcTaxIllegalResponse setBody(GetOcTaxIllegalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcTaxIllegalResponseBody getBody() {
        return this.body;
    }

}
