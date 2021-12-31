// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms_export20211101.models;

import com.aliyun.tea.*;

public class BatchGetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetResponseBody body;

    public static BatchGetResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetResponse self = new BatchGetResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetResponse setBody(BatchGetResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetResponseBody getBody() {
        return this.body;
    }

}
