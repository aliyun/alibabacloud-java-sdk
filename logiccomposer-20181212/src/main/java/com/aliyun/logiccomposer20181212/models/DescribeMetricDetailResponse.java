// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeMetricDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMetricDetailResponseBody body;

    public static DescribeMetricDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricDetailResponse self = new DescribeMetricDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetricDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetricDetailResponse setBody(DescribeMetricDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetricDetailResponseBody getBody() {
        return this.body;
    }

}
