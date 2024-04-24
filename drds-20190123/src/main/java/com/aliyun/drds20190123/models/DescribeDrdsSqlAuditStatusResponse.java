// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSqlAuditStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDrdsSqlAuditStatusResponseBody body;

    public static DescribeDrdsSqlAuditStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsSqlAuditStatusResponse self = new DescribeDrdsSqlAuditStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsSqlAuditStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDrdsSqlAuditStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDrdsSqlAuditStatusResponse setBody(DescribeDrdsSqlAuditStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsSqlAuditStatusResponseBody getBody() {
        return this.body;
    }

}
