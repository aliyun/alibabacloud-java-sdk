// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteEdgeDriverResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEdgeDriverResponseBody body;

    public static DeleteEdgeDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeDriverResponse self = new DeleteEdgeDriverResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeDriverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeDriverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEdgeDriverResponse setBody(DeleteEdgeDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeDriverResponseBody getBody() {
        return this.body;
    }

}
