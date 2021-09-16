// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class EnableEscalationPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableEscalationPlanResponseBody body;

    public static EnableEscalationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableEscalationPlanResponse self = new EnableEscalationPlanResponse();
        return TeaModel.build(map, self);
    }

    public EnableEscalationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableEscalationPlanResponse setBody(EnableEscalationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableEscalationPlanResponseBody getBody() {
        return this.body;
    }

}
