// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeLangfuseSecurityIPListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLangfuseSecurityIPListResponseBody body;

    public static DescribeLangfuseSecurityIPListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLangfuseSecurityIPListResponse self = new DescribeLangfuseSecurityIPListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLangfuseSecurityIPListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLangfuseSecurityIPListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLangfuseSecurityIPListResponse setBody(DescribeLangfuseSecurityIPListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLangfuseSecurityIPListResponseBody getBody() {
        return this.body;
    }

}
