// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddProductComponentVersionResponseBody body;

    public static AddProductComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProductComponentVersionResponse self = new AddProductComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public AddProductComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProductComponentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProductComponentVersionResponse setBody(AddProductComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProductComponentVersionResponseBody getBody() {
        return this.body;
    }

}
