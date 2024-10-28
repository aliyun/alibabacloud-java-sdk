// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeContainerAppVersionResponseBody body;

    public static CreateEdgeContainerAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppVersionResponse self = new CreateEdgeContainerAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeContainerAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeContainerAppVersionResponse setBody(CreateEdgeContainerAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeContainerAppVersionResponseBody getBody() {
        return this.body;
    }

}
