// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteDcdnDomainConfigsResponseBody body;

    public static BatchDeleteDcdnDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnDomainConfigsResponse self = new BatchDeleteDcdnDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteDcdnDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteDcdnDomainConfigsResponse setBody(BatchDeleteDcdnDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteDcdnDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
