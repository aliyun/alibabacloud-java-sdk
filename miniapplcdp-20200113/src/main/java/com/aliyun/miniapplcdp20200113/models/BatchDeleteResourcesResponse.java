// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchDeleteResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteResourcesResponseBody body;

    public static BatchDeleteResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteResourcesResponse self = new BatchDeleteResourcesResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteResourcesResponse setBody(BatchDeleteResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteResourcesResponseBody getBody() {
        return this.body;
    }

}
