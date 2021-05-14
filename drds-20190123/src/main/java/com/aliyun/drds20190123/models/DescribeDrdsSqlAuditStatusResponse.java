// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsSqlAuditStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDrdsSqlAuditStatusResponse setBody(DescribeDrdsSqlAuditStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDrdsSqlAuditStatusResponseBody getBody() {
        return this.body;
    }

}
