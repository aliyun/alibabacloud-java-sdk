// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvadeEventStatisticResponseBody body;

    public static DescribeInvadeEventStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventStatisticResponse self = new DescribeInvadeEventStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvadeEventStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvadeEventStatisticResponse setBody(DescribeInvadeEventStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvadeEventStatisticResponseBody getBody() {
        return this.body;
    }

}
