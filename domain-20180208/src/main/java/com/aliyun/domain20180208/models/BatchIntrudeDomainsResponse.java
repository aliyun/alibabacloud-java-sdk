// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchIntrudeDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchIntrudeDomainsResponseBody body;

    public static BatchIntrudeDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchIntrudeDomainsResponse self = new BatchIntrudeDomainsResponse();
        return TeaModel.build(map, self);
    }

    public BatchIntrudeDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchIntrudeDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchIntrudeDomainsResponse setBody(BatchIntrudeDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchIntrudeDomainsResponseBody getBody() {
        return this.body;
    }

}
