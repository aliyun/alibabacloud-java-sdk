// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateScaleStrategyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateScaleStrategyResponseBody body;

    public static CreateScaleStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScaleStrategyResponse self = new CreateScaleStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateScaleStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScaleStrategyResponse setBody(CreateScaleStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScaleStrategyResponseBody getBody() {
        return this.body;
    }

}
