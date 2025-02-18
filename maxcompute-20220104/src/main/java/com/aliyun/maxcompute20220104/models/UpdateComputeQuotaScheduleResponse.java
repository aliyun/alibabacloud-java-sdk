// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateComputeQuotaScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeQuotaScheduleResponseBody body;

    public static UpdateComputeQuotaScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeQuotaScheduleResponse self = new UpdateComputeQuotaScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeQuotaScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeQuotaScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeQuotaScheduleResponse setBody(UpdateComputeQuotaScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeQuotaScheduleResponseBody getBody() {
        return this.body;
    }

}
