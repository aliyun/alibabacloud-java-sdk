// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeFlowlogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowlogsResponseBody body;

    public static DescribeFlowlogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowlogsResponse self = new DescribeFlowlogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowlogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowlogsResponse setBody(DescribeFlowlogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowlogsResponseBody getBody() {
        return this.body;
    }

}
