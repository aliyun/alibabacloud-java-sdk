// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateWmInfoMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateWmInfoMappingResponseBody body;

    public static CreateWmInfoMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWmInfoMappingResponse self = new CreateWmInfoMappingResponse();
        return TeaModel.build(map, self);
    }

    public CreateWmInfoMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateWmInfoMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateWmInfoMappingResponse setBody(CreateWmInfoMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateWmInfoMappingResponseBody getBody() {
        return this.body;
    }

}
