// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateVerifySDKResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVerifySDKResponseBody body;

    public static CreateVerifySDKResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySDKResponse self = new CreateVerifySDKResponse();
        return TeaModel.build(map, self);
    }

    public CreateVerifySDKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVerifySDKResponse setBody(CreateVerifySDKResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVerifySDKResponseBody getBody() {
        return this.body;
    }

}
