// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class UpdateComputeJobDraftSqlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateComputeJobDraftSqlResponseBody body;

    public static UpdateComputeJobDraftSqlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeJobDraftSqlResponse self = new UpdateComputeJobDraftSqlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateComputeJobDraftSqlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateComputeJobDraftSqlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateComputeJobDraftSqlResponse setBody(UpdateComputeJobDraftSqlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateComputeJobDraftSqlResponseBody getBody() {
        return this.body;
    }

}
