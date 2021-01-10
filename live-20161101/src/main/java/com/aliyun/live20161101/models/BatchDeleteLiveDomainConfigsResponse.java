// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchDeleteLiveDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteLiveDomainConfigsResponseBody body;

    public static BatchDeleteLiveDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteLiveDomainConfigsResponse self = new BatchDeleteLiveDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteLiveDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteLiveDomainConfigsResponse setBody(BatchDeleteLiveDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteLiveDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
