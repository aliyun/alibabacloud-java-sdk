// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateWuyingServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWuyingServerResponseBody body;

    public static CreateWuyingServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWuyingServerResponse self = new CreateWuyingServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateWuyingServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWuyingServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWuyingServerResponse setBody(CreateWuyingServerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWuyingServerResponseBody getBody() {
        return this.body;
    }

}
