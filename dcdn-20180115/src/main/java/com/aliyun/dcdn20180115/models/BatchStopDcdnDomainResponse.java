// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchStopDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStopDcdnDomainResponseBody body;

    public static BatchStopDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopDcdnDomainResponse self = new BatchStopDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopDcdnDomainResponse setBody(BatchStopDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
