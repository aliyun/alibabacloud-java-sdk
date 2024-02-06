// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeARMServerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeARMServerInstancesResponseBody body;

    public static DescribeARMServerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeARMServerInstancesResponse self = new DescribeARMServerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeARMServerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeARMServerInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeARMServerInstancesResponse setBody(DescribeARMServerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeARMServerInstancesResponseBody getBody() {
        return this.body;
    }

}
