// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateMessageCallbackNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMessageCallbackNewResponseBody body;

    public static CreateMessageCallbackNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageCallbackNewResponse self = new CreateMessageCallbackNewResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageCallbackNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageCallbackNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageCallbackNewResponse setBody(CreateMessageCallbackNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageCallbackNewResponseBody getBody() {
        return this.body;
    }

}
