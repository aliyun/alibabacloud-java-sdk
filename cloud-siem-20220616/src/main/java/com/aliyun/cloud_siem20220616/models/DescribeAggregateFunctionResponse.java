// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAggregateFunctionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAggregateFunctionResponseBody body;

    public static DescribeAggregateFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAggregateFunctionResponse self = new DescribeAggregateFunctionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAggregateFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAggregateFunctionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAggregateFunctionResponse setBody(DescribeAggregateFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAggregateFunctionResponseBody getBody() {
        return this.body;
    }

}
