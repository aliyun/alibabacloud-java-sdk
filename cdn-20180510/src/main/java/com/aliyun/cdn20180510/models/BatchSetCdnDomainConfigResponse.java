// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchSetCdnDomainConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetCdnDomainConfigResponse setBody(BatchSetCdnDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetCdnDomainConfigResponseBody getBody() {
        return this.body;
    }

}
