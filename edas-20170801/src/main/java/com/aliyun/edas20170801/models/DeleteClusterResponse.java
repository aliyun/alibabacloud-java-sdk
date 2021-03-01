// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterResponseBody body;

    public static DeleteClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterResponse self = new DeleteClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterResponse setBody(DeleteClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterResponseBody getBody() {
        return this.body;
    }

}
