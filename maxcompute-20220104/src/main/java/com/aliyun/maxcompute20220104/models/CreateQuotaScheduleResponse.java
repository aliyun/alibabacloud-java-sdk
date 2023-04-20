// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateQuotaScheduleResponseBody body;

    public static CreateQuotaScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaScheduleResponse self = new CreateQuotaScheduleResponse();
        return TeaModel.build(map, self);
    }

    public CreateQuotaScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQuotaScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQuotaScheduleResponse setBody(CreateQuotaScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQuotaScheduleResponseBody getBody() {
        return this.body;
    }

}
