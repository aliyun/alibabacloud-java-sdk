// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class CreateOnlineTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOnlineTestResponseBody body;

    public static CreateOnlineTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineTestResponse self = new CreateOnlineTestResponse();
        return TeaModel.build(map, self);
    }

    public CreateOnlineTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOnlineTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOnlineTestResponse setBody(CreateOnlineTestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOnlineTestResponseBody getBody() {
        return this.body;
    }

}
