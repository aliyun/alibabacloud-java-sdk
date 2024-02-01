// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateEventRecordPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventRecordPlanResponseBody body;

    public static UpdateEventRecordPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventRecordPlanResponse self = new UpdateEventRecordPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventRecordPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventRecordPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventRecordPlanResponse setBody(UpdateEventRecordPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventRecordPlanResponseBody getBody() {
        return this.body;
    }

}
