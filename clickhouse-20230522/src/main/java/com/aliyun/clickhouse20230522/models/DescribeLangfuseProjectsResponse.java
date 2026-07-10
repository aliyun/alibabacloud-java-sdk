// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseProjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLangfuseProjectsResponseBody body;

    public static DescribeLangfuseProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseProjectsResponse self = new DescribeLangfuseProjectsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLangfuseProjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLangfuseProjectsResponse setBody(DescribeLangfuseProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLangfuseProjectsResponseBody getBody() {
        return this.body;
    }

}
