// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class CreateDBResourcePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBResourcePoolResponseBody body;

    public static CreateDBResourcePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBResourcePoolResponse self = new CreateDBResourcePoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBResourcePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBResourcePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBResourcePoolResponse setBody(CreateDBResourcePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBResourcePoolResponseBody getBody() {
        return this.body;
    }

}
