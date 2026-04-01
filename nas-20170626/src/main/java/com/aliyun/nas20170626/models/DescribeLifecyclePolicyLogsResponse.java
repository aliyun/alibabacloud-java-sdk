// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeLifecyclePolicyLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLifecyclePolicyLogsResponseBody body;

    public static DescribeLifecyclePolicyLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecyclePolicyLogsResponse self = new DescribeLifecyclePolicyLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLifecyclePolicyLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLifecyclePolicyLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLifecyclePolicyLogsResponse setBody(DescribeLifecyclePolicyLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLifecyclePolicyLogsResponseBody getBody() {
        return this.body;
    }

}
