// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeConsortiumsResponseBody body;

    public static DescribeConsortiumsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumsResponse self = new DescribeConsortiumsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConsortiumsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeConsortiumsResponse setBody(DescribeConsortiumsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConsortiumsResponseBody getBody() {
        return this.body;
    }

}
