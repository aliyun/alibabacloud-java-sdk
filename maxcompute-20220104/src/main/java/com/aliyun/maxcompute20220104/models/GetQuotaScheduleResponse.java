// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetQuotaScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetQuotaScheduleResponseBody body;

    public static GetQuotaScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaScheduleResponse self = new GetQuotaScheduleResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaScheduleResponse setBody(GetQuotaScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaScheduleResponseBody getBody() {
        return this.body;
    }

}
