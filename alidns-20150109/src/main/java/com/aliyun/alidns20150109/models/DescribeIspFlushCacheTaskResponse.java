// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIspFlushCacheTaskResponseBody body;

    public static DescribeIspFlushCacheTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheTaskResponse self = new DescribeIspFlushCacheTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIspFlushCacheTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIspFlushCacheTaskResponse setBody(DescribeIspFlushCacheTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIspFlushCacheTaskResponseBody getBody() {
        return this.body;
    }

}
