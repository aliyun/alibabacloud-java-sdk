// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGtmInstancesResponseBody body;

    public static DescribeGtmInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstancesResponse self = new DescribeGtmInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGtmInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGtmInstancesResponse setBody(DescribeGtmInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGtmInstancesResponseBody getBody() {
        return this.body;
    }

}
