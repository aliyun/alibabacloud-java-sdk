// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DescribeSecurityIPListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityIPListResponseBody body;

    public static DescribeSecurityIPListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityIPListResponse self = new DescribeSecurityIPListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityIPListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityIPListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityIPListResponse setBody(DescribeSecurityIPListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityIPListResponseBody getBody() {
        return this.body;
    }

}
