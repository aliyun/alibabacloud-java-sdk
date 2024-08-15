// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableEscalationPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableEscalationPlanResponseBody body;

    public static DisableEscalationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableEscalationPlanResponse self = new DisableEscalationPlanResponse();
        return TeaModel.build(map, self);
    }

    public DisableEscalationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableEscalationPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableEscalationPlanResponse setBody(DisableEscalationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableEscalationPlanResponseBody getBody() {
        return this.body;
    }

}
