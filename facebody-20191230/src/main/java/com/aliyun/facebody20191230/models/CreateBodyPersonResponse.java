// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyPersonResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBodyPersonResponseBody body;

    public static CreateBodyPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBodyPersonResponse self = new CreateBodyPersonResponse();
        return TeaModel.build(map, self);
    }

    public CreateBodyPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBodyPersonResponse setBody(CreateBodyPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBodyPersonResponseBody getBody() {
        return this.body;
    }

}
