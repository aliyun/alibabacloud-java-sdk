// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRelatedWorkspacesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRelatedWorkspacesResponseBody body;

    public static GetRelatedWorkspacesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRelatedWorkspacesResponse self = new GetRelatedWorkspacesResponse();
        return TeaModel.build(map, self);
    }

    public GetRelatedWorkspacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRelatedWorkspacesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRelatedWorkspacesResponse setBody(GetRelatedWorkspacesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRelatedWorkspacesResponseBody getBody() {
        return this.body;
    }

}
