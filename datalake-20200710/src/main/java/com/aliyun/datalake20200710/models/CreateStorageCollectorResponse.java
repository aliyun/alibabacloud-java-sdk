// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateStorageCollectorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStorageCollectorResponseBody body;

    public static CreateStorageCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageCollectorResponse self = new CreateStorageCollectorResponse();
        return TeaModel.build(map, self);
    }

    public CreateStorageCollectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStorageCollectorResponse setBody(CreateStorageCollectorResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStorageCollectorResponseBody getBody() {
        return this.body;
    }

}
