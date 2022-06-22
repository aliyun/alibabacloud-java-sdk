// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetMyManageWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMyManageWorkspaceResponseBody body;

    public static GetMyManageWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMyManageWorkspaceResponse self = new GetMyManageWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetMyManageWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMyManageWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMyManageWorkspaceResponse setBody(GetMyManageWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMyManageWorkspaceResponseBody getBody() {
        return this.body;
    }

}
