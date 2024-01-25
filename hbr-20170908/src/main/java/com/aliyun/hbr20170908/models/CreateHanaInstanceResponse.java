// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateHanaInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHanaInstanceResponseBody body;

    public static CreateHanaInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHanaInstanceResponse self = new CreateHanaInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateHanaInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHanaInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHanaInstanceResponse setBody(CreateHanaInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHanaInstanceResponseBody getBody() {
        return this.body;
    }

}
