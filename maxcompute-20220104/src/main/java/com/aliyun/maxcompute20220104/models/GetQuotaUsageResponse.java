// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQuotaUsageResponseBody body;

    public static GetQuotaUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaUsageResponse self = new GetQuotaUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaUsageResponse setBody(GetQuotaUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaUsageResponseBody getBody() {
        return this.body;
    }

}
