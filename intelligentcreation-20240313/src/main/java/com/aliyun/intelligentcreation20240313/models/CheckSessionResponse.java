// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CheckSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckSessionResponseBody body;

    public static CheckSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSessionResponse self = new CheckSessionResponse();
        return TeaModel.build(map, self);
    }

    public CheckSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckSessionResponse setBody(CheckSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSessionResponseBody getBody() {
        return this.body;
    }

}
