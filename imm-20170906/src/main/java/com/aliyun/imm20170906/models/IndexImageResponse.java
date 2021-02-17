// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class IndexImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IndexImageResponseBody body;

    public static IndexImageResponse build(java.util.Map<String, ?> map) throws Exception {
        IndexImageResponse self = new IndexImageResponse();
        return TeaModel.build(map, self);
    }

    public IndexImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IndexImageResponse setBody(IndexImageResponseBody body) {
        this.body = body;
        return this;
    }
    public IndexImageResponseBody getBody() {
        return this.body;
    }

}
