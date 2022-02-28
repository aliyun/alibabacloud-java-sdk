// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeReplicationStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReplicationStatisticsResponseBody body;

    public static DescribeReplicationStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationStatisticsResponse self = new DescribeReplicationStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicationStatisticsResponse setBody(DescribeReplicationStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicationStatisticsResponseBody getBody() {
        return this.body;
    }

}
