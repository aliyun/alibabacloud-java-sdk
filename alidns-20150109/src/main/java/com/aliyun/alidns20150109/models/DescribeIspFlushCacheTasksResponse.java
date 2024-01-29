// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIspFlushCacheTasksResponseBody body;

    public static DescribeIspFlushCacheTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheTasksResponse self = new DescribeIspFlushCacheTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIspFlushCacheTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIspFlushCacheTasksResponse setBody(DescribeIspFlushCacheTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIspFlushCacheTasksResponseBody getBody() {
        return this.body;
    }

}
