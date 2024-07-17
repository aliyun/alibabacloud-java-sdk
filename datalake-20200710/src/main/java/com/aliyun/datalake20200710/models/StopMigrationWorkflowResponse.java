// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class StopMigrationWorkflowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopMigrationWorkflowResponseBody body;

    public static StopMigrationWorkflowResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMigrationWorkflowResponse self = new StopMigrationWorkflowResponse();
        return TeaModel.build(map, self);
    }

    public StopMigrationWorkflowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMigrationWorkflowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMigrationWorkflowResponse setBody(StopMigrationWorkflowResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMigrationWorkflowResponseBody getBody() {
        return this.body;
    }

}
