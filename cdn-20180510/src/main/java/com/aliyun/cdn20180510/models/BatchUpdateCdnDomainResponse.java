// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchUpdateCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchUpdateCdnDomainResponse setBody(BatchUpdateCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateCdnDomainResponseBody getBody() {
        return this.body;
    }

}
