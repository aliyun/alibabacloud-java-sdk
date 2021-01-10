// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateImageCacheResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateImageCacheResponseBody body;

    public static CreateImageCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImageCacheResponse self = new CreateImageCacheResponse();
        return TeaModel.build(map, self);
    }

    public CreateImageCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImageCacheResponse setBody(CreateImageCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImageCacheResponseBody getBody() {
        return this.body;
    }

}
