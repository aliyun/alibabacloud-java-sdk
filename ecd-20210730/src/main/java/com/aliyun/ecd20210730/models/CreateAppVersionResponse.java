// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppVersionResponseBody body;

    public static CreateAppVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppVersionResponse self = new CreateAppVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppVersionResponse setBody(CreateAppVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppVersionResponseBody getBody() {
        return this.body;
    }

}
