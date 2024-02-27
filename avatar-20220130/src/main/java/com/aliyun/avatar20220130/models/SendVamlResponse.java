// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class SendVamlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendVamlResponseBody body;

    public static SendVamlResponse build(java.util.Map<String, ?> map) throws Exception {
        SendVamlResponse self = new SendVamlResponse();
        return TeaModel.build(map, self);
    }

    public SendVamlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendVamlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendVamlResponse setBody(SendVamlResponseBody body) {
        this.body = body;
        return this;
    }
    public SendVamlResponseBody getBody() {
        return this.body;
    }

}
