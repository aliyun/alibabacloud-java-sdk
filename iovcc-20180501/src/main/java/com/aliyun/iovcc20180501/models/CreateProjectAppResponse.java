// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateProjectAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProjectAppResponseBody body;

    public static CreateProjectAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectAppResponse self = new CreateProjectAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectAppResponse setBody(CreateProjectAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectAppResponseBody getBody() {
        return this.body;
    }

}
