// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeTrailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTrailsResponseBody body;

    public static DescribeTrailsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrailsResponse self = new DescribeTrailsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrailsResponse setBody(DescribeTrailsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrailsResponseBody getBody() {
        return this.body;
    }

}
