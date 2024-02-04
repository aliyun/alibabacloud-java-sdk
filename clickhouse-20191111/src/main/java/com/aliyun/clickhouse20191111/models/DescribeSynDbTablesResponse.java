// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSynDbTablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSynDbTablesResponseBody body;

    public static DescribeSynDbTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynDbTablesResponse self = new DescribeSynDbTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynDbTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynDbTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynDbTablesResponse setBody(DescribeSynDbTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynDbTablesResponseBody getBody() {
        return this.body;
    }

}
