// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeVpcHavsInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVpcHavsInstancesResponseBody body;

    public static DescribeVpcHavsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcHavsInstancesResponse self = new DescribeVpcHavsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpcHavsInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpcHavsInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpcHavsInstancesResponse setBody(DescribeVpcHavsInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpcHavsInstancesResponseBody getBody() {
        return this.body;
    }

}
