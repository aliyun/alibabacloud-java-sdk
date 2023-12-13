// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateVirtualNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVirtualNodeResponseBody body;

    public static CreateVirtualNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualNodeResponse self = new CreateVirtualNodeResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualNodeResponse setBody(CreateVirtualNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualNodeResponseBody getBody() {
        return this.body;
    }

}
