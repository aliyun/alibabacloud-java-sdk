// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLangfuseUserResponseBody body;

    public static DescribeLangfuseUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseUserResponse self = new DescribeLangfuseUserResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLangfuseUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLangfuseUserResponse setBody(DescribeLangfuseUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLangfuseUserResponseBody getBody() {
        return this.body;
    }

}
