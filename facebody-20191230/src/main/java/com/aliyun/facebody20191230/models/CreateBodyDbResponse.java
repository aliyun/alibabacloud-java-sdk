// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyDbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBodyDbResponseBody body;

    public static CreateBodyDbResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBodyDbResponse self = new CreateBodyDbResponse();
        return TeaModel.build(map, self);
    }

    public CreateBodyDbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBodyDbResponse setBody(CreateBodyDbResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBodyDbResponseBody getBody() {
        return this.body;
    }

}
