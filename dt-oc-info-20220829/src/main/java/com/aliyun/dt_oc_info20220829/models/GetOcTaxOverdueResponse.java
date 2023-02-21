// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcTaxOverdueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcTaxOverdueResponseBody body;

    public static GetOcTaxOverdueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcTaxOverdueResponse self = new GetOcTaxOverdueResponse();
        return TeaModel.build(map, self);
    }

    public GetOcTaxOverdueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcTaxOverdueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcTaxOverdueResponse setBody(GetOcTaxOverdueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcTaxOverdueResponseBody getBody() {
        return this.body;
    }

}
