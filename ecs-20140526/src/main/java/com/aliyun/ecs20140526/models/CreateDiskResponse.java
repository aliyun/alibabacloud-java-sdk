// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateDiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDiskResponseBody body;

    public static CreateDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiskResponse self = new CreateDiskResponse();
        return TeaModel.build(map, self);
    }

    public CreateDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDiskResponse setBody(CreateDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDiskResponseBody getBody() {
        return this.body;
    }

}
