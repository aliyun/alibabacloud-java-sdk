// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class AddMemoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddMemoriesResponseBody body;

    public static AddMemoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMemoriesResponse self = new AddMemoriesResponse();
        return TeaModel.build(map, self);
    }

    public AddMemoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMemoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMemoriesResponse setBody(AddMemoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMemoriesResponseBody getBody() {
        return this.body;
    }

}
