// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeWaitingOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWaitingOrdersResponseBody body;

    public static DescribeWaitingOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWaitingOrdersResponse self = new DescribeWaitingOrdersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWaitingOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWaitingOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWaitingOrdersResponse setBody(DescribeWaitingOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWaitingOrdersResponseBody getBody() {
        return this.body;
    }

}
