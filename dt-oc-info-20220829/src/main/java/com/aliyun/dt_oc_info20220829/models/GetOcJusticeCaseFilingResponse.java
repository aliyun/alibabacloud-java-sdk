// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcJusticeCaseFilingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetOcJusticeCaseFilingResponseBody body;

    public static GetOcJusticeCaseFilingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOcJusticeCaseFilingResponse self = new GetOcJusticeCaseFilingResponse();
        return TeaModel.build(map, self);
    }

    public GetOcJusticeCaseFilingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOcJusticeCaseFilingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOcJusticeCaseFilingResponse setBody(GetOcJusticeCaseFilingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOcJusticeCaseFilingResponseBody getBody() {
        return this.body;
    }

}
