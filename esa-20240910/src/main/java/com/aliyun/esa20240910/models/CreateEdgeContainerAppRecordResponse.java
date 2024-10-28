// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeContainerAppRecordResponseBody body;

    public static CreateEdgeContainerAppRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppRecordResponse self = new CreateEdgeContainerAppRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeContainerAppRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeContainerAppRecordResponse setBody(CreateEdgeContainerAppRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeContainerAppRecordResponseBody getBody() {
        return this.body;
    }

}
