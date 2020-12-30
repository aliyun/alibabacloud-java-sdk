// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteExecutionPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteExecutionPlanResponseBody body;

    public static DeleteExecutionPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExecutionPlanResponse self = new DeleteExecutionPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExecutionPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExecutionPlanResponse setBody(DeleteExecutionPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExecutionPlanResponseBody getBody() {
        return this.body;
    }

}
