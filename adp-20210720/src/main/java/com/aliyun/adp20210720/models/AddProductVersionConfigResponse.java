// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddProductVersionConfigResponseBody body;

    public static AddProductVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProductVersionConfigResponse self = new AddProductVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public AddProductVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProductVersionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProductVersionConfigResponse setBody(AddProductVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProductVersionConfigResponseBody getBody() {
        return this.body;
    }

}
