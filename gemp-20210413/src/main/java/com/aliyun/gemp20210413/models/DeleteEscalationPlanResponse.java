// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteEscalationPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEscalationPlanResponseBody body;

    public static DeleteEscalationPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEscalationPlanResponse self = new DeleteEscalationPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEscalationPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEscalationPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEscalationPlanResponse setBody(DeleteEscalationPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEscalationPlanResponseBody getBody() {
        return this.body;
    }

}
