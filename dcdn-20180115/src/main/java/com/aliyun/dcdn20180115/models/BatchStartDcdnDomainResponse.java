// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchStartDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchStartDcdnDomainResponseBody body;

    public static BatchStartDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStartDcdnDomainResponse self = new BatchStartDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStartDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStartDcdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStartDcdnDomainResponse setBody(BatchStartDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
