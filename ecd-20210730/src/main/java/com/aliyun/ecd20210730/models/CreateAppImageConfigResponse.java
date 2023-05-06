// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppImageConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppImageConfigResponseBody body;

    public static CreateAppImageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppImageConfigResponse self = new CreateAppImageConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppImageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppImageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppImageConfigResponse setBody(CreateAppImageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppImageConfigResponseBody getBody() {
        return this.body;
    }

}
