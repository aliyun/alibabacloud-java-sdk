// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendCommandResponseBody body;

    public static SendCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        SendCommandResponse self = new SendCommandResponse();
        return TeaModel.build(map, self);
    }

    public SendCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendCommandResponse setBody(SendCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public SendCommandResponseBody getBody() {
        return this.body;
    }

}
