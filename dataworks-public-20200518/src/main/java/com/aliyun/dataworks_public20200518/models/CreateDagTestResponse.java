// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDagTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDagTestResponseBody body;

    public static CreateDagTestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDagTestResponse self = new CreateDagTestResponse();
        return TeaModel.build(map, self);
    }

    public CreateDagTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDagTestResponse setBody(CreateDagTestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDagTestResponseBody getBody() {
        return this.body;
    }

}
