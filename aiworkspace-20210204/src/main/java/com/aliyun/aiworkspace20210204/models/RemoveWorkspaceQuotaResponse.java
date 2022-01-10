// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class RemoveWorkspaceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveWorkspaceQuotaResponseBody body;

    public static RemoveWorkspaceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveWorkspaceQuotaResponse self = new RemoveWorkspaceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public RemoveWorkspaceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveWorkspaceQuotaResponse setBody(RemoveWorkspaceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveWorkspaceQuotaResponseBody getBody() {
        return this.body;
    }

}
