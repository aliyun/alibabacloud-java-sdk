// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLivePullToPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLivePullToPushResponseBody body;

    public static CreateLivePullToPushResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePullToPushResponse self = new CreateLivePullToPushResponse();
        return TeaModel.build(map, self);
    }

    public CreateLivePullToPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLivePullToPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLivePullToPushResponse setBody(CreateLivePullToPushResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLivePullToPushResponseBody getBody() {
        return this.body;
    }

}
