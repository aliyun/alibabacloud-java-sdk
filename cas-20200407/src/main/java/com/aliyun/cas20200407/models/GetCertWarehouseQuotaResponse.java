// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertWarehouseQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCertWarehouseQuotaResponseBody body;

    public static GetCertWarehouseQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCertWarehouseQuotaResponse self = new GetCertWarehouseQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetCertWarehouseQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCertWarehouseQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCertWarehouseQuotaResponse setBody(GetCertWarehouseQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCertWarehouseQuotaResponseBody getBody() {
        return this.body;
    }

}
