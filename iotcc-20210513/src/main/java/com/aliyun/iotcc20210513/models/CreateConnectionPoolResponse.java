// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateConnectionPoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConnectionPoolResponseBody body;

    public static CreateConnectionPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionPoolResponse self = new CreateConnectionPoolResponse();
        return TeaModel.build(map, self);
    }

    public CreateConnectionPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConnectionPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConnectionPoolResponse setBody(CreateConnectionPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConnectionPoolResponseBody getBody() {
        return this.body;
    }

}
