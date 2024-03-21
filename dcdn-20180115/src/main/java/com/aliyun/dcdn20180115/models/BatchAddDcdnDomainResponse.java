// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchAddDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddDcdnDomainResponseBody body;

    public static BatchAddDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddDcdnDomainResponse self = new BatchAddDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddDcdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddDcdnDomainResponse setBody(BatchAddDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
