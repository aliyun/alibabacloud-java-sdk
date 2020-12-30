// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateExecutionPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateExecutionPlanResponseBody body;

    public static CreateExecutionPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExecutionPlanResponse self = new CreateExecutionPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateExecutionPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExecutionPlanResponse setBody(CreateExecutionPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExecutionPlanResponseBody getBody() {
        return this.body;
    }

}
