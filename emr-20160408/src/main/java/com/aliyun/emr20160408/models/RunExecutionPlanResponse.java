// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RunExecutionPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunExecutionPlanResponseBody body;

    public static RunExecutionPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        RunExecutionPlanResponse self = new RunExecutionPlanResponse();
        return TeaModel.build(map, self);
    }

    public RunExecutionPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunExecutionPlanResponse setBody(RunExecutionPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public RunExecutionPlanResponseBody getBody() {
        return this.body;
    }

}
