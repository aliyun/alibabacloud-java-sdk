// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class CreateCustomizedInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomizedInfoResponseBody body;

    public static CreateCustomizedInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedInfoResponse self = new CreateCustomizedInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomizedInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomizedInfoResponse setBody(CreateCustomizedInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomizedInfoResponseBody getBody() {
        return this.body;
    }

}
