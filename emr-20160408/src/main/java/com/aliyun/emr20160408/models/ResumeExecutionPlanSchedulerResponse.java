// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ResumeExecutionPlanSchedulerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeExecutionPlanSchedulerResponseBody body;

    public static ResumeExecutionPlanSchedulerResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeExecutionPlanSchedulerResponse self = new ResumeExecutionPlanSchedulerResponse();
        return TeaModel.build(map, self);
    }

    public ResumeExecutionPlanSchedulerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeExecutionPlanSchedulerResponse setBody(ResumeExecutionPlanSchedulerResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeExecutionPlanSchedulerResponseBody getBody() {
        return this.body;
    }

}
