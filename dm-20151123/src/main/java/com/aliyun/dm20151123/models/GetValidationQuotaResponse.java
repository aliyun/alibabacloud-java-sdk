// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetValidationQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetValidationQuotaResponseBody body;

    public static GetValidationQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetValidationQuotaResponse self = new GetValidationQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetValidationQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetValidationQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetValidationQuotaResponse setBody(GetValidationQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetValidationQuotaResponseBody getBody() {
        return this.body;
    }

}
