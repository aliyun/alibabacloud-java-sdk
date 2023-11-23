// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLdpsNamespacedQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLdpsNamespacedQuotaResponseBody body;

    public static GetLdpsNamespacedQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLdpsNamespacedQuotaResponse self = new GetLdpsNamespacedQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetLdpsNamespacedQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLdpsNamespacedQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLdpsNamespacedQuotaResponse setBody(GetLdpsNamespacedQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLdpsNamespacedQuotaResponseBody getBody() {
        return this.body;
    }

}
