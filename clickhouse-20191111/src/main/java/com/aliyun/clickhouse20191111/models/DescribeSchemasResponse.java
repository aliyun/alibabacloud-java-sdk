// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSchemasResponseBody body;

    public static DescribeSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSchemasResponse self = new DescribeSchemasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSchemasResponse setBody(DescribeSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSchemasResponseBody getBody() {
        return this.body;
    }

}
