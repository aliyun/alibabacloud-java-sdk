// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AddSubResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddSubResponseBody body;

    public static AddSubResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSubResponse self = new AddSubResponse();
        return TeaModel.build(map, self);
    }

    public AddSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddSubResponse setBody(AddSubResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSubResponseBody getBody() {
        return this.body;
    }

}
