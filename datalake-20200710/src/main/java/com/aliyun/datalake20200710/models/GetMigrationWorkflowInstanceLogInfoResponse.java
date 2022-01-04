// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetMigrationWorkflowInstanceLogInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMigrationWorkflowInstanceLogInfoResponseBody body;

    public static GetMigrationWorkflowInstanceLogInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationWorkflowInstanceLogInfoResponse self = new GetMigrationWorkflowInstanceLogInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetMigrationWorkflowInstanceLogInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMigrationWorkflowInstanceLogInfoResponse setBody(GetMigrationWorkflowInstanceLogInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMigrationWorkflowInstanceLogInfoResponseBody getBody() {
        return this.body;
    }

}
