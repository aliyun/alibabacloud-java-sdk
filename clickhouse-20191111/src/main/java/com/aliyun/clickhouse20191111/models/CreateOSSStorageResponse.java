// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateOSSStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOSSStorageResponseBody body;

    public static CreateOSSStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOSSStorageResponse self = new CreateOSSStorageResponse();
        return TeaModel.build(map, self);
    }

    public CreateOSSStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOSSStorageResponse setBody(CreateOSSStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOSSStorageResponseBody getBody() {
        return this.body;
    }

}
