// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeRegionIspsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRegionIspsResponseBody body;

    public static DescribeRegionIspsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionIspsResponse self = new DescribeRegionIspsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionIspsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionIspsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRegionIspsResponse setBody(DescribeRegionIspsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionIspsResponseBody getBody() {
        return this.body;
    }

}
