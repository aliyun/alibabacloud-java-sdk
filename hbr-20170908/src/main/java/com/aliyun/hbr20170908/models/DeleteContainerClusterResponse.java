// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class DeleteContainerClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContainerClusterResponseBody body;

    public static DeleteContainerClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerClusterResponse self = new DeleteContainerClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContainerClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContainerClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContainerClusterResponse setBody(DeleteContainerClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContainerClusterResponseBody getBody() {
        return this.body;
    }

}
