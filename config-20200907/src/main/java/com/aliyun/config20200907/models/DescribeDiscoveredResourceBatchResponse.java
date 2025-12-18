// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeDiscoveredResourceBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiscoveredResourceBatchResponseBody body;

    public static DescribeDiscoveredResourceBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiscoveredResourceBatchResponse self = new DescribeDiscoveredResourceBatchResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiscoveredResourceBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiscoveredResourceBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiscoveredResourceBatchResponse setBody(DescribeDiscoveredResourceBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiscoveredResourceBatchResponseBody getBody() {
        return this.body;
    }

}
