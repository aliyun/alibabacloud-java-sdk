// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchSetLiveDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchSetLiveDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetLiveDomainConfigsResponse setBody(BatchSetLiveDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetLiveDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
