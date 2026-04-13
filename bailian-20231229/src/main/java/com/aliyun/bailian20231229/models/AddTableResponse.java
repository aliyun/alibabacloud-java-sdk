// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddTableResponseBody body;

    public static AddTableResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTableResponse self = new AddTableResponse();
        return TeaModel.build(map, self);
    }

    public AddTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTableResponse setBody(AddTableResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTableResponseBody getBody() {
        return this.body;
    }

}
