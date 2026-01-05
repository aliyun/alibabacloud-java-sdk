// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsTrademarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSmsTrademarkResponseBody body;

    public static CreateSmsTrademarkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTrademarkResponse self = new CreateSmsTrademarkResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmsTrademarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmsTrademarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSmsTrademarkResponse setBody(CreateSmsTrademarkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmsTrademarkResponseBody getBody() {
        return this.body;
    }

}
