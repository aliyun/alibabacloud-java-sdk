// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSynDbsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSynDbsResponseBody body;

    public static DescribeSynDbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynDbsResponse self = new DescribeSynDbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSynDbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSynDbsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSynDbsResponse setBody(DescribeSynDbsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSynDbsResponseBody getBody() {
        return this.body;
    }

}
