// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateAIPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAIPlanResponseBody body;

    public static CreateAIPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIPlanResponse self = new CreateAIPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIPlanResponse setBody(CreateAIPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIPlanResponseBody getBody() {
        return this.body;
    }

}
