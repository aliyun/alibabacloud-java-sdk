// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddSmsSignResponseBody body;

    public static AddSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSmsSignResponse self = new AddSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public AddSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSmsSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSmsSignResponse setBody(AddSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSmsSignResponseBody getBody() {
        return this.body;
    }

}
