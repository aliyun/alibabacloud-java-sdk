// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeDriverVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEdgeDriverVersionResponseBody body;

    public static CreateEdgeDriverVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeDriverVersionResponse self = new CreateEdgeDriverVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeDriverVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeDriverVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeDriverVersionResponse setBody(CreateEdgeDriverVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

}
