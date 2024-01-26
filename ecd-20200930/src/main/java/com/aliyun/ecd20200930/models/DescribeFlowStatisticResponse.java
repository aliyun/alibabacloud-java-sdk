// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeFlowStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFlowStatisticResponseBody body;

    public static DescribeFlowStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowStatisticResponse self = new DescribeFlowStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFlowStatisticResponse setBody(DescribeFlowStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowStatisticResponseBody getBody() {
        return this.body;
    }

}
