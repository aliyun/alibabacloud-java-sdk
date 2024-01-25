// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMessageResponseBody body;

    public static CreateMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageResponse self = new CreateMessageResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageResponse setBody(CreateMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageResponseBody getBody() {
        return this.body;
    }

}
