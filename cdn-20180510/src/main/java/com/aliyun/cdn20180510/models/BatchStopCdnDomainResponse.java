// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchStopCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStopCdnDomainResponseBody body;

    public static BatchStopCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopCdnDomainResponse self = new BatchStopCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchStopCdnDomainResponse setBody(BatchStopCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopCdnDomainResponseBody getBody() {
        return this.body;
    }

}
