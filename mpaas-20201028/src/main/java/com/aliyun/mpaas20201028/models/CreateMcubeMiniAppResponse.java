// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeMiniAppResponseBody body;

    public static CreateMcubeMiniAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniAppResponse self = new CreateMcubeMiniAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeMiniAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeMiniAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeMiniAppResponse setBody(CreateMcubeMiniAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeMiniAppResponseBody getBody() {
        return this.body;
    }

}
