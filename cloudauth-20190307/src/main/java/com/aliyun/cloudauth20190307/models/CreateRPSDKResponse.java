// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateRPSDKResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRPSDKResponseBody body;

    public static CreateRPSDKResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRPSDKResponse self = new CreateRPSDKResponse();
        return TeaModel.build(map, self);
    }

    public CreateRPSDKResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRPSDKResponse setBody(CreateRPSDKResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRPSDKResponseBody getBody() {
        return this.body;
    }

}
