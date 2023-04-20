// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaScheduleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateQuotaScheduleResponseBody body;

    public static UpdateQuotaScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaScheduleResponse self = new UpdateQuotaScheduleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQuotaScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQuotaScheduleResponse setBody(UpdateQuotaScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQuotaScheduleResponseBody getBody() {
        return this.body;
    }

}
