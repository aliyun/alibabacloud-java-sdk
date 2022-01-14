// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateOpenSingleDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOpenSingleDataResponseBody body;

    public static CreateOpenSingleDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSingleDataResponse self = new CreateOpenSingleDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpenSingleDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpenSingleDataResponse setBody(CreateOpenSingleDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpenSingleDataResponseBody getBody() {
        return this.body;
    }

}
