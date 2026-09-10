// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationWorkflowSubmitStartResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBwmMigrationWorkflowSubmitStartResponseBody body;

    public static GetBwmMigrationWorkflowSubmitStartResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationWorkflowSubmitStartResponse self = new GetBwmMigrationWorkflowSubmitStartResponse();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationWorkflowSubmitStartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBwmMigrationWorkflowSubmitStartResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBwmMigrationWorkflowSubmitStartResponse setBody(GetBwmMigrationWorkflowSubmitStartResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBwmMigrationWorkflowSubmitStartResponseBody getBody() {
        return this.body;
    }

}
