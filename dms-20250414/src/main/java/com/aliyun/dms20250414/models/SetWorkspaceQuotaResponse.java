// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SetWorkspaceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetWorkspaceQuotaResponseBody body;

    public static SetWorkspaceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWorkspaceQuotaResponse self = new SetWorkspaceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetWorkspaceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWorkspaceQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetWorkspaceQuotaResponse setBody(SetWorkspaceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWorkspaceQuotaResponseBody getBody() {
        return this.body;
    }

}
