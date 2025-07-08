// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateMessageCallbackTestNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMessageCallbackTestNewResponseBody body;

    public static CreateMessageCallbackTestNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageCallbackTestNewResponse self = new CreateMessageCallbackTestNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageCallbackTestNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageCallbackTestNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageCallbackTestNewResponse setBody(CreateMessageCallbackTestNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageCallbackTestNewResponseBody getBody() {
        return this.body;
    }

}
