// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetServiceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceQuotaResponseBody body;

    public static GetServiceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceQuotaResponse self = new GetServiceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceQuotaResponse setBody(GetServiceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceQuotaResponseBody getBody() {
        return this.body;
    }

}
