// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWorkspaceResourceResponseBody body;

    public static CreateWorkspaceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResourceResponse self = new CreateWorkspaceResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWorkspaceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWorkspaceResourceResponse setBody(CreateWorkspaceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWorkspaceResourceResponseBody getBody() {
        return this.body;
    }

}
