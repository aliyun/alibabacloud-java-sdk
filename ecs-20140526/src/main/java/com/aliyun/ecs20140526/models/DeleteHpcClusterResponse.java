// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteHpcClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHpcClusterResponseBody body;

    public static DeleteHpcClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHpcClusterResponse self = new DeleteHpcClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHpcClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHpcClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHpcClusterResponse setBody(DeleteHpcClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHpcClusterResponseBody getBody() {
        return this.body;
    }

}
