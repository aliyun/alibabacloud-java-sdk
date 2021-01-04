// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateGroupNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGroupNodesResponseBody body;

    public static UpdateGroupNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupNodesResponse self = new UpdateGroupNodesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGroupNodesResponse setBody(UpdateGroupNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGroupNodesResponseBody getBody() {
        return this.body;
    }

}
