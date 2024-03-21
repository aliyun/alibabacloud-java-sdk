// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetDcdnDomainConfigsResponseBody body;

    public static BatchSetDcdnDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnDomainConfigsResponse self = new BatchSetDcdnDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetDcdnDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetDcdnDomainConfigsResponse setBody(BatchSetDcdnDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetDcdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
