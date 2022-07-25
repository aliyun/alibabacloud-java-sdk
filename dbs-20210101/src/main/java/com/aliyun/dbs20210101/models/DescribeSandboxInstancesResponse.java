// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSandboxInstancesResponseBody body;

    public static DescribeSandboxInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxInstancesResponse self = new DescribeSandboxInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSandboxInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSandboxInstancesResponse setBody(DescribeSandboxInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSandboxInstancesResponseBody getBody() {
        return this.body;
    }

}
