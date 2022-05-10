// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateUdfFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUdfFileResponseBody body;

    public static CreateUdfFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfFileResponse self = new CreateUdfFileResponse();
        return TeaModel.build(map, self);
    }

    public CreateUdfFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUdfFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUdfFileResponse setBody(CreateUdfFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUdfFileResponseBody getBody() {
        return this.body;
    }

}
