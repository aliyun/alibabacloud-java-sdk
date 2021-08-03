// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulOverviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVulOverviewResponseBody body;

    public static DescribeVulOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulOverviewResponse self = new DescribeVulOverviewResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVulOverviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVulOverviewResponse setBody(DescribeVulOverviewResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVulOverviewResponseBody getBody() {
        return this.body;
    }

}
