// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopBlueprintInstanceWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopBlueprintInstanceWorkflowResponseBody body;

    public static StopBlueprintInstanceWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        StopBlueprintInstanceWorkflowResponse self = new StopBlueprintInstanceWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public StopBlueprintInstanceWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopBlueprintInstanceWorkflowResponse setBody(StopBlueprintInstanceWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public StopBlueprintInstanceWorkflowResponseBody getBody() {
        return this.body;
    }

}
