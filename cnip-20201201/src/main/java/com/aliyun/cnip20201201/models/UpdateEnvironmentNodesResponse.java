// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEnvironmentNodesResponseBody body;

    public static UpdateEnvironmentNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentNodesResponse self = new UpdateEnvironmentNodesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvironmentNodesResponse setBody(UpdateEnvironmentNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEnvironmentNodesResponseBody getBody() {
        return this.body;
    }

}
