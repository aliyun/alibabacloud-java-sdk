// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class AddGameToProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddGameToProjectResponseBody body;

    public static AddGameToProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGameToProjectResponse self = new AddGameToProjectResponse();
        return TeaModel.build(map, self);
    }

    public AddGameToProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddGameToProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddGameToProjectResponse setBody(AddGameToProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public AddGameToProjectResponseBody getBody() {
        return this.body;
    }

}
