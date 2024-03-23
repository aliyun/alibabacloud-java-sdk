// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateModelVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateModelVersionResponseBody body;

    public static CreateModelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelVersionResponse self = new CreateModelVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelVersionResponse setBody(CreateModelVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelVersionResponseBody getBody() {
        return this.body;
    }

}
