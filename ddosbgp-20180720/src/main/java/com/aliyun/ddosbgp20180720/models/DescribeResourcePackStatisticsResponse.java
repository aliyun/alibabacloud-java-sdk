// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeResourcePackStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResourcePackStatisticsResponseBody body;

    public static DescribeResourcePackStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackStatisticsResponse self = new DescribeResourcePackStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcePackStatisticsResponse setBody(DescribeResourcePackStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcePackStatisticsResponseBody getBody() {
        return this.body;
    }

}
