// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMsacAppResponseBody body;

    public static CreateMsacAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacAppResponse self = new CreateMsacAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateMsacAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMsacAppResponse setBody(CreateMsacAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMsacAppResponseBody getBody() {
        return this.body;
    }

}
