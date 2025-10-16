// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeInvadeEventNameListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInvadeEventNameListResponseBody body;

    public static DescribeInvadeEventNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvadeEventNameListResponse self = new DescribeInvadeEventNameListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvadeEventNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvadeEventNameListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInvadeEventNameListResponse setBody(DescribeInvadeEventNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvadeEventNameListResponseBody getBody() {
        return this.body;
    }

}
