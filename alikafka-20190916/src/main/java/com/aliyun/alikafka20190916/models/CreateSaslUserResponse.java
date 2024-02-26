// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreateSaslUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSaslUserResponseBody body;

    public static CreateSaslUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSaslUserResponse self = new CreateSaslUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateSaslUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSaslUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSaslUserResponse setBody(CreateSaslUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSaslUserResponseBody getBody() {
        return this.body;
    }

}
