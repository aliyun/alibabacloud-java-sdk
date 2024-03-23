// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkspaceResourceResponseBody body;

    public static UpdateWorkspaceResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResourceResponse self = new UpdateWorkspaceResourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceResourceResponse setBody(UpdateWorkspaceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceResourceResponseBody getBody() {
        return this.body;
    }

}
