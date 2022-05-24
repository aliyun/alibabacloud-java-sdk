// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteClusterNodepoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClusterNodepoolResponseBody body;

    public static DeleteClusterNodepoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterNodepoolResponse self = new DeleteClusterNodepoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClusterNodepoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClusterNodepoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClusterNodepoolResponse setBody(DeleteClusterNodepoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClusterNodepoolResponseBody getBody() {
        return this.body;
    }

}
