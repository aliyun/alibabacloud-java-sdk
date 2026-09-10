// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationTaskWriterWorkflowListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBwmMigrationTaskWriterWorkflowListResponseBody body;

    public static GetBwmMigrationTaskWriterWorkflowListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationTaskWriterWorkflowListResponse self = new GetBwmMigrationTaskWriterWorkflowListResponse();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationTaskWriterWorkflowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBwmMigrationTaskWriterWorkflowListResponse setBody(GetBwmMigrationTaskWriterWorkflowListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBwmMigrationTaskWriterWorkflowListResponseBody getBody() {
        return this.body;
    }

}
