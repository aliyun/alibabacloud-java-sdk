// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDedicatedHostClusterResponseBody body;

    public static DeleteDedicatedHostClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostClusterResponse self = new DeleteDedicatedHostClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedHostClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDedicatedHostClusterResponse setBody(DeleteDedicatedHostClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDedicatedHostClusterResponseBody getBody() {
        return this.body;
    }

}
