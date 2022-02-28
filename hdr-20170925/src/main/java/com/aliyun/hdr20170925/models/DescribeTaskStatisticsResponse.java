// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeTaskStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTaskStatisticsResponseBody body;

    public static DescribeTaskStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskStatisticsResponse self = new DescribeTaskStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTaskStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTaskStatisticsResponse setBody(DescribeTaskStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTaskStatisticsResponseBody getBody() {
        return this.body;
    }

}
