// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumSpecsResponseBody body;

    public static DescribeConsortiumSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumSpecsResponse self = new DescribeConsortiumSpecsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumSpecsResponse setBody(DescribeConsortiumSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumSpecsResponseBody getBody() {
        return this.body;
    }

}
