// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeContainerAppResponseBody body;

    public static CreateEdgeContainerAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppResponse self = new CreateEdgeContainerAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeContainerAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeContainerAppResponse setBody(CreateEdgeContainerAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeContainerAppResponseBody getBody() {
        return this.body;
    }

}
