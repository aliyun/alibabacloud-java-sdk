// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteServerlessClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServerlessClusterResponseBody body;

    public static DeleteServerlessClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServerlessClusterResponse self = new DeleteServerlessClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServerlessClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServerlessClusterResponse setBody(DeleteServerlessClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServerlessClusterResponseBody getBody() {
        return this.body;
    }

}
