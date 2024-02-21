// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchDeleteCdnDomainConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteCdnDomainConfigResponseBody body;

    public static BatchDeleteCdnDomainConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteCdnDomainConfigResponse self = new BatchDeleteCdnDomainConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteCdnDomainConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteCdnDomainConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteCdnDomainConfigResponse setBody(BatchDeleteCdnDomainConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteCdnDomainConfigResponseBody getBody() {
        return this.body;
    }

}
