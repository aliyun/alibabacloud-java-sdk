// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class IndexFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IndexFileMetaResponseBody body;

    public static IndexFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        IndexFileMetaResponse self = new IndexFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public IndexFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IndexFileMetaResponse setBody(IndexFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public IndexFileMetaResponseBody getBody() {
        return this.body;
    }

}
