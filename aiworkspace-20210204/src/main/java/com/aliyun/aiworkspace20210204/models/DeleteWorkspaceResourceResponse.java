// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkspaceResourceResponseBody body;

    public static DeleteWorkspaceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResourceResponse self = new DeleteWorkspaceResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkspaceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkspaceResourceResponse setBody(DeleteWorkspaceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkspaceResourceResponseBody getBody() {
        return this.body;
    }

}
