// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEdgeContainerAppRecordResponseBody body;

    public static DeleteEdgeContainerAppRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppRecordResponse self = new DeleteEdgeContainerAppRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEdgeContainerAppRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEdgeContainerAppRecordResponse setBody(DeleteEdgeContainerAppRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEdgeContainerAppRecordResponseBody getBody() {
        return this.body;
    }

}
