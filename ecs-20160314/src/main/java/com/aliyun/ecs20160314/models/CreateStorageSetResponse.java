// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateStorageSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStorageSetResponseBody body;

    public static CreateStorageSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageSetResponse self = new CreateStorageSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStorageSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStorageSetResponse setBody(CreateStorageSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStorageSetResponseBody getBody() {
        return this.body;
    }

}
