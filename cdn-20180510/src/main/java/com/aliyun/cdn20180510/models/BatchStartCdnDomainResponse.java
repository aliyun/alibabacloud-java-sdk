// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStartCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchStartCdnDomainResponse setBody(BatchStartCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStartCdnDomainResponseBody getBody() {
        return this.body;
    }

}
