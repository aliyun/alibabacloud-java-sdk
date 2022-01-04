// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkspaceConfigResponseBody body;

    public static UpdateWorkspaceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceConfigResponse self = new UpdateWorkspaceConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceConfigResponse setBody(UpdateWorkspaceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceConfigResponseBody getBody() {
        return this.body;
    }

}
