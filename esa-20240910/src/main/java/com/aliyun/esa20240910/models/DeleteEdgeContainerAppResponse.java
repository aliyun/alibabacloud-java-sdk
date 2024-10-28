// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEdgeContainerAppResponseBody body;

    public static DeleteEdgeContainerAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppResponse self = new DeleteEdgeContainerAppResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeContainerAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEdgeContainerAppResponse setBody(DeleteEdgeContainerAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeContainerAppResponseBody getBody() {
        return this.body;
    }

}
