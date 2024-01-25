// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeEventTopologyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventTopologyResponseBody body;

    public static DescribeEventTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTopologyResponse self = new DescribeEventTopologyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventTopologyResponse setBody(DescribeEventTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventTopologyResponseBody getBody() {
        return this.body;
    }

}
