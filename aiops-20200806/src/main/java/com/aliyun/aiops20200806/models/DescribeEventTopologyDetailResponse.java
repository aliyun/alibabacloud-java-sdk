// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeEventTopologyDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventTopologyDetailResponseBody body;

    public static DescribeEventTopologyDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTopologyDetailResponse self = new DescribeEventTopologyDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventTopologyDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventTopologyDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventTopologyDetailResponse setBody(DescribeEventTopologyDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventTopologyDetailResponseBody getBody() {
        return this.body;
    }

}
