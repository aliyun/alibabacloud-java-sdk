// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchUpdateFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUpdateFileMetaResponseBody body;

    public static BatchUpdateFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileMetaResponse self = new BatchUpdateFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateFileMetaResponse setBody(BatchUpdateFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateFileMetaResponseBody getBody() {
        return this.body;
    }

}
