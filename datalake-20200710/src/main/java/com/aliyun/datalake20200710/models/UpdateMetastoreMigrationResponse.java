// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateMetastoreMigrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMetastoreMigrationResponseBody body;

    public static UpdateMetastoreMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetastoreMigrationResponse self = new UpdateMetastoreMigrationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetastoreMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMetastoreMigrationResponse setBody(UpdateMetastoreMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMetastoreMigrationResponseBody getBody() {
        return this.body;
    }

}
