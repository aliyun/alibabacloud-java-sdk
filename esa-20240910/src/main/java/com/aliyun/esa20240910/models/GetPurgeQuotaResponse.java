// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetPurgeQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPurgeQuotaResponseBody body;

    public static GetPurgeQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPurgeQuotaResponse self = new GetPurgeQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetPurgeQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPurgeQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPurgeQuotaResponse setBody(GetPurgeQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPurgeQuotaResponseBody getBody() {
        return this.body;
    }

}
