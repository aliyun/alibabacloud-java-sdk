// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetWorkspaceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetWorkspaceQuotaResponseBody body;

    public static GetWorkspaceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceQuotaResponse self = new GetWorkspaceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetWorkspaceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetWorkspaceQuotaResponse setBody(GetWorkspaceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetWorkspaceQuotaResponseBody getBody() {
        return this.body;
    }

}
