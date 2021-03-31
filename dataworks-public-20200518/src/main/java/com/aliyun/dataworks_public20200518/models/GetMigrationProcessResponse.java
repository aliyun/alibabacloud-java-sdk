// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMigrationProcessResponseBody body;

    public static GetMigrationProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationProcessResponse self = new GetMigrationProcessResponse();
        return TeaModel.build(map, self);
    }

    public GetMigrationProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMigrationProcessResponse setBody(GetMigrationProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMigrationProcessResponseBody getBody() {
        return this.body;
    }

}
