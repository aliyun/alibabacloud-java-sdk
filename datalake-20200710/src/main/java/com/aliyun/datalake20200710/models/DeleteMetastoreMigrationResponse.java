// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DeleteMetastoreMigrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMetastoreMigrationResponseBody body;

    public static DeleteMetastoreMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetastoreMigrationResponse self = new DeleteMetastoreMigrationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMetastoreMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMetastoreMigrationResponse setBody(DeleteMetastoreMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMetastoreMigrationResponseBody getBody() {
        return this.body;
    }

}
