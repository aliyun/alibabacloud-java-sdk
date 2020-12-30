// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchSetCdnDomainConfigResponseBody body;

    public static BatchSetCdnDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetCdnDomainConfigResponse self = new BatchSetCdnDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetCdnDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetCdnDomainConfigResponse setBody(BatchSetCdnDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetCdnDomainConfigResponseBody getBody() {
        return this.body;
    }

}
