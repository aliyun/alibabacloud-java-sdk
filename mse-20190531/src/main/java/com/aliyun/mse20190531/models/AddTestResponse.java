// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddTestResponseBody body;

    public static AddTestResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTestResponse self = new AddTestResponse();
        return TeaModel.build(map, self);
    }

    public AddTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddTestResponse setBody(AddTestResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTestResponseBody getBody() {
        return this.body;
    }

}
