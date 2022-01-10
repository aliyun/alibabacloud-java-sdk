// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateWorkspaceResourceResponse setBody(UpdateWorkspaceResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceResourceResponseBody getBody() {
        return this.body;
    }

}
