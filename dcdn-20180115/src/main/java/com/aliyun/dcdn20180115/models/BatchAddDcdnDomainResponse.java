// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchAddDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchAddDcdnDomainResponse setBody(BatchAddDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAddDcdnDomainResponseBody getBody() {
        return this.body;
    }

}
