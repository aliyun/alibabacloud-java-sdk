// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseOrgsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLangfuseOrgsResponseBody body;

    public static DescribeLangfuseOrgsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseOrgsResponse self = new DescribeLangfuseOrgsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseOrgsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLangfuseOrgsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLangfuseOrgsResponse setBody(DescribeLangfuseOrgsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLangfuseOrgsResponseBody getBody() {
        return this.body;
    }

}
