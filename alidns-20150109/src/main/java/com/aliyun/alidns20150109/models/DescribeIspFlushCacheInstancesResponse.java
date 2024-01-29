// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIspFlushCacheInstancesResponseBody body;

    public static DescribeIspFlushCacheInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheInstancesResponse self = new DescribeIspFlushCacheInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIspFlushCacheInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIspFlushCacheInstancesResponse setBody(DescribeIspFlushCacheInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIspFlushCacheInstancesResponseBody getBody() {
        return this.body;
    }

}
