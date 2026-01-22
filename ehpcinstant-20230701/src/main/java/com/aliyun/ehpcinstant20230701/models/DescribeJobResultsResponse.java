// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DescribeJobResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobResultsResponseBody body;

    public static DescribeJobResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResultsResponse self = new DescribeJobResultsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobResultsResponse setBody(DescribeJobResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobResultsResponseBody getBody() {
        return this.body;
    }

}
