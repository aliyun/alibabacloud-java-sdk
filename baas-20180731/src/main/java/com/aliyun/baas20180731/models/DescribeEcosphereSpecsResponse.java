// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeEcosphereSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEcosphereSpecsResponseBody body;

    public static DescribeEcosphereSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcosphereSpecsResponse self = new DescribeEcosphereSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEcosphereSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEcosphereSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEcosphereSpecsResponse setBody(DescribeEcosphereSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEcosphereSpecsResponseBody getBody() {
        return this.body;
    }

}
