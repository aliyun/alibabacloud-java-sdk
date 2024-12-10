// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeEssdCacheConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEssdCacheConfigResponseBody body;

    public static DescribeEssdCacheConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEssdCacheConfigResponse self = new DescribeEssdCacheConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEssdCacheConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEssdCacheConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEssdCacheConfigResponse setBody(DescribeEssdCacheConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEssdCacheConfigResponseBody getBody() {
        return this.body;
    }

}
