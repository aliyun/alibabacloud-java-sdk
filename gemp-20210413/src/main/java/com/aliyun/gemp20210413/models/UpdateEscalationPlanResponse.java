// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateEscalationPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEscalationPlanResponseBody body;

    public static UpdateEscalationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEscalationPlanResponse self = new UpdateEscalationPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEscalationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEscalationPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEscalationPlanResponse setBody(UpdateEscalationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEscalationPlanResponseBody getBody() {
        return this.body;
    }

}
