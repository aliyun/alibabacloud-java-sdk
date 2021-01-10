// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateAIAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAIAppResponseBody body;

    public static CreateAIAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAIAppResponse self = new CreateAIAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateAIAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAIAppResponse setBody(CreateAIAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAIAppResponseBody getBody() {
        return this.body;
    }

}
