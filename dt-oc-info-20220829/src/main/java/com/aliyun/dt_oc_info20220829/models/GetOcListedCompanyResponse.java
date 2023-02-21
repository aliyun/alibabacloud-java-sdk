// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcListedCompanyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcListedCompanyResponseBody body;

    public static GetOcListedCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcListedCompanyResponse self = new GetOcListedCompanyResponse();
        return TeaModel.build(map, self);
    }

    public GetOcListedCompanyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcListedCompanyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcListedCompanyResponse setBody(GetOcListedCompanyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcListedCompanyResponseBody getBody() {
        return this.body;
    }

}
