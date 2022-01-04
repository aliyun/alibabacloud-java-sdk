// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateMetastoreMigrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMetastoreMigrationResponseBody body;

    public static CreateMetastoreMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMetastoreMigrationResponse self = new CreateMetastoreMigrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateMetastoreMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMetastoreMigrationResponse setBody(CreateMetastoreMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMetastoreMigrationResponseBody getBody() {
        return this.body;
    }

}
