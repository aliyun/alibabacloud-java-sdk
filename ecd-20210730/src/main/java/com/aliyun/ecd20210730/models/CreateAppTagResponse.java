// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppTagResponseBody body;

    public static CreateAppTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppTagResponse self = new CreateAppTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppTagResponse setBody(CreateAppTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppTagResponseBody getBody() {
        return this.body;
    }

}
