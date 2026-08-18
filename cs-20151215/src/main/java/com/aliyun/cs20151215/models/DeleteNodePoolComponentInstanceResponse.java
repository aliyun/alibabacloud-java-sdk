// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeleteNodePoolComponentInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNodePoolComponentInstanceResponseBody body;

    public static DeleteNodePoolComponentInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodePoolComponentInstanceResponse self = new DeleteNodePoolComponentInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNodePoolComponentInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNodePoolComponentInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNodePoolComponentInstanceResponse setBody(DeleteNodePoolComponentInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNodePoolComponentInstanceResponseBody getBody() {
        return this.body;
    }

}
