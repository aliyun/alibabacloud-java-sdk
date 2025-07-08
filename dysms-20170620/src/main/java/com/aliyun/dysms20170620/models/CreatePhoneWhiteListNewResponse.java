// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreatePhoneWhiteListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePhoneWhiteListNewResponseBody body;

    public static CreatePhoneWhiteListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneWhiteListNewResponse self = new CreatePhoneWhiteListNewResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhoneWhiteListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhoneWhiteListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePhoneWhiteListNewResponse setBody(CreatePhoneWhiteListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhoneWhiteListNewResponseBody getBody() {
        return this.body;
    }

}
