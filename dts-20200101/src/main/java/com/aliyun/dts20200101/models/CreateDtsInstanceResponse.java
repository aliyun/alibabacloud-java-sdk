// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateDtsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDtsInstanceResponseBody body;

    public static CreateDtsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDtsInstanceResponse self = new CreateDtsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateDtsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDtsInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDtsInstanceResponse setBody(CreateDtsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDtsInstanceResponseBody getBody() {
        return this.body;
    }

}
