// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribePackIpListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePackIpListResponseBody body;

    public static DescribePackIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackIpListResponse self = new DescribePackIpListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePackIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePackIpListResponse setBody(DescribePackIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePackIpListResponseBody getBody() {
        return this.body;
    }

}
