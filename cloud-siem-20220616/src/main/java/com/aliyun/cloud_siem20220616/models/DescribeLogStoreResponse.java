// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogStoreResponseBody body;

    public static DescribeLogStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreResponse self = new DescribeLogStoreResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogStoreResponse setBody(DescribeLogStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogStoreResponseBody getBody() {
        return this.body;
    }

}
