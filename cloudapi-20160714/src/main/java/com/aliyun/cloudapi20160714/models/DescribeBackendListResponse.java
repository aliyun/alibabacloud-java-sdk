// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackendListResponseBody body;

    public static DescribeBackendListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendListResponse self = new DescribeBackendListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackendListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackendListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackendListResponse setBody(DescribeBackendListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackendListResponseBody getBody() {
        return this.body;
    }

}
