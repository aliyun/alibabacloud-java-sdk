// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetMyJoinWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMyJoinWorkspaceResponseBody body;

    public static GetMyJoinWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMyJoinWorkspaceResponse self = new GetMyJoinWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetMyJoinWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMyJoinWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMyJoinWorkspaceResponse setBody(GetMyJoinWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMyJoinWorkspaceResponseBody getBody() {
        return this.body;
    }

}
