// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstancePerformanceRestrictHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInstancePerformanceRestrictHistoryResponseBody body;

    public static DescribeInstancePerformanceRestrictHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePerformanceRestrictHistoryResponse self = new DescribeInstancePerformanceRestrictHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePerformanceRestrictHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancePerformanceRestrictHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstancePerformanceRestrictHistoryResponse setBody(DescribeInstancePerformanceRestrictHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancePerformanceRestrictHistoryResponseBody getBody() {
        return this.body;
    }

}
