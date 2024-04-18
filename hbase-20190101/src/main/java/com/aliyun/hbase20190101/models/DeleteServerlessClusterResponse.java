// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteServerlessClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteServerlessClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteServerlessClusterResponse setBody(DeleteServerlessClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServerlessClusterResponseBody getBody() {
        return this.body;
    }

}
