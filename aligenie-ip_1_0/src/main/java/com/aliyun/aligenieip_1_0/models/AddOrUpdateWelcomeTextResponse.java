// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddOrUpdateWelcomeTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddOrUpdateWelcomeTextResponseBody body;

    public static AddOrUpdateWelcomeTextResponse build(java.util.Map<String, ?> map) throws Exception {
        AddOrUpdateWelcomeTextResponse self = new AddOrUpdateWelcomeTextResponse();
        return TeaModel.build(map, self);
    }

    public AddOrUpdateWelcomeTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddOrUpdateWelcomeTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddOrUpdateWelcomeTextResponse setBody(AddOrUpdateWelcomeTextResponseBody body) {
        this.body = body;
        return this;
    }
    public AddOrUpdateWelcomeTextResponseBody getBody() {
        return this.body;
    }

}
