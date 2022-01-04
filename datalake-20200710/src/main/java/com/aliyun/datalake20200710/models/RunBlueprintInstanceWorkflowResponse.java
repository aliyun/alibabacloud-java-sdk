// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunBlueprintInstanceWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunBlueprintInstanceWorkflowResponseBody body;

    public static RunBlueprintInstanceWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RunBlueprintInstanceWorkflowResponse self = new RunBlueprintInstanceWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public RunBlueprintInstanceWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunBlueprintInstanceWorkflowResponse setBody(RunBlueprintInstanceWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public RunBlueprintInstanceWorkflowResponseBody getBody() {
        return this.body;
    }

}
