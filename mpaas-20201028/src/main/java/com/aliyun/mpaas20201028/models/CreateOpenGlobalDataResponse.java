// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateOpenGlobalDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOpenGlobalDataResponseBody body;

    public static CreateOpenGlobalDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenGlobalDataResponse self = new CreateOpenGlobalDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpenGlobalDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpenGlobalDataResponse setBody(CreateOpenGlobalDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpenGlobalDataResponseBody getBody() {
        return this.body;
    }

}
