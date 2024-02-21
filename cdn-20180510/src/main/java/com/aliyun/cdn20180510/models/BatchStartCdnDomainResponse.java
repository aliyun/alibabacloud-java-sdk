// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStartCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchStartCdnDomainResponseBody body;

    public static BatchStartCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStartCdnDomainResponse self = new BatchStartCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStartCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStartCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStartCdnDomainResponse setBody(BatchStartCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartCdnDomainResponseBody getBody() {
        return this.body;
    }

}
