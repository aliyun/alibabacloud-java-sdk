// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEdgeInstanceResponseBody body;

    public static DeleteEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeInstanceResponse self = new DeleteEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEdgeInstanceResponse setBody(DeleteEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
