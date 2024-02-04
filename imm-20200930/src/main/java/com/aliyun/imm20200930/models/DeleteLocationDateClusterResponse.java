// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DeleteLocationDateClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLocationDateClusterResponseBody body;

    public static DeleteLocationDateClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLocationDateClusterResponse self = new DeleteLocationDateClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLocationDateClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLocationDateClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLocationDateClusterResponse setBody(DeleteLocationDateClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLocationDateClusterResponseBody getBody() {
        return this.body;
    }

}
