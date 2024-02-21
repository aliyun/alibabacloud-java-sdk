// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchAddCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAddCdnDomainResponseBody body;

    public static BatchAddCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAddCdnDomainResponse self = new BatchAddCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchAddCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAddCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAddCdnDomainResponse setBody(BatchAddCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddCdnDomainResponseBody getBody() {
        return this.body;
    }

}
