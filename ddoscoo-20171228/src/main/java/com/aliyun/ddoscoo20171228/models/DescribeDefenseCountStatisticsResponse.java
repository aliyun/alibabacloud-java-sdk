// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDefenseCountStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDefenseCountStatisticsResponseBody body;

    public static DescribeDefenseCountStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseCountStatisticsResponse self = new DescribeDefenseCountStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseCountStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseCountStatisticsResponse setBody(DescribeDefenseCountStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseCountStatisticsResponseBody getBody() {
        return this.body;
    }

}
