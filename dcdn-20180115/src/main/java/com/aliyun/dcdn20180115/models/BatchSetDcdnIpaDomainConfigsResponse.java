// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnIpaDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetDcdnIpaDomainConfigsResponseBody body;

    public static BatchSetDcdnIpaDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnIpaDomainConfigsResponse self = new BatchSetDcdnIpaDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnIpaDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetDcdnIpaDomainConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetDcdnIpaDomainConfigsResponse setBody(BatchSetDcdnIpaDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetDcdnIpaDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
