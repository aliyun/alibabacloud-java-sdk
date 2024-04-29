// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortFlowListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortFlowListResponseBody body;

    public static DescribePortFlowListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortFlowListResponse self = new DescribePortFlowListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortFlowListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortFlowListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortFlowListResponse setBody(DescribePortFlowListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortFlowListResponseBody getBody() {
        return this.body;
    }

}
