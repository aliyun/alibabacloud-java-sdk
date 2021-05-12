// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetProductVersionPlatformsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetProductVersionPlatformsResponseBody body;

    public static GetProductVersionPlatformsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionPlatformsResponse self = new GetProductVersionPlatformsResponse();
        return TeaModel.build(map, self);
    }

    public GetProductVersionPlatformsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProductVersionPlatformsResponse setBody(GetProductVersionPlatformsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetProductVersionPlatformsResponseBody getBody() {
        return this.body;
    }

}
