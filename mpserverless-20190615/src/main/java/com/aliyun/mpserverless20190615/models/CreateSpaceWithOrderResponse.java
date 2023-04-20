// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSpaceWithOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSpaceWithOrderResponseBody body;

    public static CreateSpaceWithOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSpaceWithOrderResponse self = new CreateSpaceWithOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateSpaceWithOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSpaceWithOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSpaceWithOrderResponse setBody(CreateSpaceWithOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSpaceWithOrderResponseBody getBody() {
        return this.body;
    }

}
