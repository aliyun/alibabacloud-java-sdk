// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeNodeCidrListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodeCidrListResponseBody body;

    public static DescribeNodeCidrListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeCidrListResponse self = new DescribeNodeCidrListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeCidrListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeCidrListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNodeCidrListResponse setBody(DescribeNodeCidrListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeCidrListResponseBody getBody() {
        return this.body;
    }

}
