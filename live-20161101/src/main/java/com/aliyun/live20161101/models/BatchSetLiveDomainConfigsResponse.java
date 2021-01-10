// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchSetLiveDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchSetLiveDomainConfigsResponseBody body;

    public static BatchSetLiveDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetLiveDomainConfigsResponse self = new BatchSetLiveDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetLiveDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetLiveDomainConfigsResponse setBody(BatchSetLiveDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetLiveDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
