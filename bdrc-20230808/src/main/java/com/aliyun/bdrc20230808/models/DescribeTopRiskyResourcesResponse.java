// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeTopRiskyResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTopRiskyResourcesResponseBody body;

    public static DescribeTopRiskyResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopRiskyResourcesResponse self = new DescribeTopRiskyResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopRiskyResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTopRiskyResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTopRiskyResourcesResponse setBody(DescribeTopRiskyResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTopRiskyResourcesResponseBody getBody() {
        return this.body;
    }

}
