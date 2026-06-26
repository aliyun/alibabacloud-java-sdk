// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolSyncJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserPoolSyncJobResponseBody body;

    public static GetUserPoolSyncJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserPoolSyncJobResponse self = new GetUserPoolSyncJobResponse();
        return TeaModel.build(map, self);
    }

    public GetUserPoolSyncJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserPoolSyncJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserPoolSyncJobResponse setBody(GetUserPoolSyncJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserPoolSyncJobResponseBody getBody() {
        return this.body;
    }

}
