// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLogicDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLogicDatabaseResponseBody body;

    public static CreateLogicDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicDatabaseResponse self = new CreateLogicDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogicDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogicDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogicDatabaseResponse setBody(CreateLogicDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogicDatabaseResponseBody getBody() {
        return this.body;
    }

}
