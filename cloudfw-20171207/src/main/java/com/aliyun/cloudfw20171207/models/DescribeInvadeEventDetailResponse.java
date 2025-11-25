// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvadeEventDetailResponseBody body;

    public static DescribeInvadeEventDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventDetailResponse self = new DescribeInvadeEventDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvadeEventDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvadeEventDetailResponse setBody(DescribeInvadeEventDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvadeEventDetailResponseBody getBody() {
        return this.body;
    }

}
