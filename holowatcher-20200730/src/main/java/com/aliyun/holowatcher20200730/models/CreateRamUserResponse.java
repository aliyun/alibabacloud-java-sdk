// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateRamUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRamUserResponseBody body;

    public static CreateRamUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRamUserResponse self = new CreateRamUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateRamUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRamUserResponse setBody(CreateRamUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRamUserResponseBody getBody() {
        return this.body;
    }

}
