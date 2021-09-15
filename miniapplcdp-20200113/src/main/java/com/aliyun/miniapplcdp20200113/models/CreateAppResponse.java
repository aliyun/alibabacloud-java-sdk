// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppResponseBody body;

    public static CreateAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppResponse self = new CreateAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppResponse setBody(CreateAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppResponseBody getBody() {
        return this.body;
    }

}
