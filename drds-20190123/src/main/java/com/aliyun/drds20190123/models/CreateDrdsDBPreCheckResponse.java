// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CreateDrdsDBPreCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDrdsDBPreCheckResponseBody body;

    public static CreateDrdsDBPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDrdsDBPreCheckResponse self = new CreateDrdsDBPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public CreateDrdsDBPreCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDrdsDBPreCheckResponse setBody(CreateDrdsDBPreCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDrdsDBPreCheckResponseBody getBody() {
        return this.body;
    }

}
