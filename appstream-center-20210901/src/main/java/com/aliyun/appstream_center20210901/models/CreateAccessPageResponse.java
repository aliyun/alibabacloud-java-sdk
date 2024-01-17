// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateAccessPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAccessPageResponseBody body;

    public static CreateAccessPageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessPageResponse self = new CreateAccessPageResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessPageResponse setBody(CreateAccessPageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessPageResponseBody getBody() {
        return this.body;
    }

}
