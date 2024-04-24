// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class AddImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddImageResponseBody body;

    public static AddImageResponse build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponse self = new AddImageResponse();
        return TeaModel.build(map, self);
    }

    public AddImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddImageResponse setBody(AddImageResponseBody body) {
        this.body = body;
        return this;
    }
    public AddImageResponseBody getBody() {
        return this.body;
    }

}
