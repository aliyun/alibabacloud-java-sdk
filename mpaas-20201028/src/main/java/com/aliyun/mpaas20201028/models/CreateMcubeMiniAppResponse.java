// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMcubeMiniAppResponse setBody(CreateMcubeMiniAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeMiniAppResponseBody getBody() {
        return this.body;
    }

}
