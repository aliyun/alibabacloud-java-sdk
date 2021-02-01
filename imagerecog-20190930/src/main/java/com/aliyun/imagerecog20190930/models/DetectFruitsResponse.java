// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class DetectFruitsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectFruitsResponseBody body;

    public static DetectFruitsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFruitsResponse self = new DetectFruitsResponse();
        return TeaModel.build(map, self);
    }

    public DetectFruitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectFruitsResponse setBody(DetectFruitsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectFruitsResponseBody getBody() {
        return this.body;
    }

}
