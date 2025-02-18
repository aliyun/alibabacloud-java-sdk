// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetComputeQuotaScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetComputeQuotaScheduleResponseBody body;

    public static GetComputeQuotaScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetComputeQuotaScheduleResponse self = new GetComputeQuotaScheduleResponse();
        return TeaModel.build(map, self);
    }

    public GetComputeQuotaScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetComputeQuotaScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetComputeQuotaScheduleResponse setBody(GetComputeQuotaScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetComputeQuotaScheduleResponseBody getBody() {
        return this.body;
    }

}
