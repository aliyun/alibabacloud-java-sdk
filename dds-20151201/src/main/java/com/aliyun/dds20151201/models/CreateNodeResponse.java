// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class CreateNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNodeResponseBody body;

    public static CreateNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeResponse self = new CreateNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNodeResponse setBody(CreateNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNodeResponseBody getBody() {
        return this.body;
    }

}
