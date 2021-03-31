// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTableResponseBody body;

    public static CreateTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTableResponse self = new CreateTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTableResponse setBody(CreateTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTableResponseBody getBody() {
        return this.body;
    }

}
