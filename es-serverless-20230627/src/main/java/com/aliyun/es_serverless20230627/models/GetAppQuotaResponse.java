// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class GetAppQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppQuotaResponseBody body;

    public static GetAppQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppQuotaResponse self = new GetAppQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetAppQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppQuotaResponse setBody(GetAppQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppQuotaResponseBody getBody() {
        return this.body;
    }

}
