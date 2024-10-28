// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEdgeContainerAppVersionResponseBody body;

    public static DeleteEdgeContainerAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppVersionResponse self = new DeleteEdgeContainerAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeContainerAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEdgeContainerAppVersionResponse setBody(DeleteEdgeContainerAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeContainerAppVersionResponseBody getBody() {
        return this.body;
    }

}
