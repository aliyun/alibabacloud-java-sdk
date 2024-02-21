// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchUpdateCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateCdnDomainResponseBody body;

    public static BatchUpdateCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateCdnDomainResponse self = new BatchUpdateCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateCdnDomainResponse setBody(BatchUpdateCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateCdnDomainResponseBody getBody() {
        return this.body;
    }

}
