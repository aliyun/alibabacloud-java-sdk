// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvadeEventListResponseBody body;

    public static DescribeInvadeEventListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventListResponse self = new DescribeInvadeEventListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvadeEventListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvadeEventListResponse setBody(DescribeInvadeEventListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvadeEventListResponseBody getBody() {
        return this.body;
    }

}
