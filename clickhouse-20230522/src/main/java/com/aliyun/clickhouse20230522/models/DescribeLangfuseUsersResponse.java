// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLangfuseUsersResponseBody body;

    public static DescribeLangfuseUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseUsersResponse self = new DescribeLangfuseUsersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLangfuseUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLangfuseUsersResponse setBody(DescribeLangfuseUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLangfuseUsersResponseBody getBody() {
        return this.body;
    }

}
