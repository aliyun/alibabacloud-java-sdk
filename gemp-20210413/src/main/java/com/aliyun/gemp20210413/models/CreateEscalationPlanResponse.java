// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateEscalationPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEscalationPlanResponseBody body;

    public static CreateEscalationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEscalationPlanResponse self = new CreateEscalationPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateEscalationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEscalationPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEscalationPlanResponse setBody(CreateEscalationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEscalationPlanResponseBody getBody() {
        return this.body;
    }

}
