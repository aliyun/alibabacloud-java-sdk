// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DisableEscalationPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DisableEscalationPlanResponse setBody(DisableEscalationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableEscalationPlanResponseBody getBody() {
        return this.body;
    }

}
