// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class GetFlowAuditLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFlowAuditLogsResponseBody body;

    public static GetFlowAuditLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFlowAuditLogsResponse self = new GetFlowAuditLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetFlowAuditLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFlowAuditLogsResponse setBody(GetFlowAuditLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFlowAuditLogsResponseBody getBody() {
        return this.body;
    }

}
