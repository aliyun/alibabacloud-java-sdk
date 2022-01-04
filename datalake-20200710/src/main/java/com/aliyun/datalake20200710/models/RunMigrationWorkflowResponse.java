// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RunMigrationWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunMigrationWorkflowResponseBody body;

    public static RunMigrationWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMigrationWorkflowResponse self = new RunMigrationWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public RunMigrationWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunMigrationWorkflowResponse setBody(RunMigrationWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public RunMigrationWorkflowResponseBody getBody() {
        return this.body;
    }

}
