// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetEscalationPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEscalationPlanResponseBody body;

    public static GetEscalationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEscalationPlanResponse self = new GetEscalationPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetEscalationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEscalationPlanResponse setBody(GetEscalationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEscalationPlanResponseBody getBody() {
        return this.body;
    }

}
