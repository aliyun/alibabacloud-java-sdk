// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class IndexVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IndexVideoResponseBody body;

    public static IndexVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        IndexVideoResponse self = new IndexVideoResponse();
        return TeaModel.build(map, self);
    }

    public IndexVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IndexVideoResponse setBody(IndexVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public IndexVideoResponseBody getBody() {
        return this.body;
    }

}
