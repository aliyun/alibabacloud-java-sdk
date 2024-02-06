// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeResourceTimelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceTimelineResponseBody body;

    public static DescribeResourceTimelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTimelineResponse self = new DescribeResourceTimelineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTimelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceTimelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceTimelineResponse setBody(DescribeResourceTimelineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceTimelineResponseBody getBody() {
        return this.body;
    }

}
