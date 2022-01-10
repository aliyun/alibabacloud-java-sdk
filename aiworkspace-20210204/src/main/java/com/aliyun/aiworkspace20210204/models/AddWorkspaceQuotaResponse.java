// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddWorkspaceQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddWorkspaceQuotaResponseBody body;

    public static AddWorkspaceQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceQuotaResponse self = new AddWorkspaceQuotaResponse();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddWorkspaceQuotaResponse setBody(AddWorkspaceQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddWorkspaceQuotaResponseBody getBody() {
        return this.body;
    }

}
