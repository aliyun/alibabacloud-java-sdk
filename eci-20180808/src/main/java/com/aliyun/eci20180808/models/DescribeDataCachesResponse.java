// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeDataCachesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataCachesResponseBody body;

    public static DescribeDataCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCachesResponse self = new DescribeDataCachesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataCachesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataCachesResponse setBody(DescribeDataCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataCachesResponseBody getBody() {
        return this.body;
    }

}
