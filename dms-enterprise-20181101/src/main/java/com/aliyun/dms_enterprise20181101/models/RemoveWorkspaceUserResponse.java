// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RemoveWorkspaceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveWorkspaceUserResponseBody body;

    public static RemoveWorkspaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveWorkspaceUserResponse self = new RemoveWorkspaceUserResponse();
        return TeaModel.build(map, self);
    }

    public RemoveWorkspaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveWorkspaceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveWorkspaceUserResponse setBody(RemoveWorkspaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveWorkspaceUserResponseBody getBody() {
        return this.body;
    }

}
