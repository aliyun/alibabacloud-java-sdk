// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateForwardStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateForwardStrategyResponseBody body;

    public static CreateForwardStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardStrategyResponse self = new CreateForwardStrategyResponse();
        return TeaModel.build(map, self);
    }

    public CreateForwardStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateForwardStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateForwardStrategyResponse setBody(CreateForwardStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateForwardStrategyResponseBody getBody() {
        return this.body;
    }

}
