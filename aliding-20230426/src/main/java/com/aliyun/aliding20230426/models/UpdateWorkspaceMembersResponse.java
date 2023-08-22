// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceMembersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkspaceMembersResponseBody body;

    public static UpdateWorkspaceMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceMembersResponse self = new UpdateWorkspaceMembersResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceMembersResponse setBody(UpdateWorkspaceMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceMembersResponseBody getBody() {
        return this.body;
    }

}
