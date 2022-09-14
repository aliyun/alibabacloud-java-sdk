// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class AddAccountAsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddAccountAsInstanceResponseBody body;

    public static AddAccountAsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAccountAsInstanceResponse self = new AddAccountAsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddAccountAsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAccountAsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAccountAsInstanceResponse setBody(AddAccountAsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAccountAsInstanceResponseBody getBody() {
        return this.body;
    }

}
