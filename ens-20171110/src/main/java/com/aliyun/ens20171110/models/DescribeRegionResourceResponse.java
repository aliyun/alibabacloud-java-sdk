// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeRegionResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRegionResourceResponseBody body;

    public static DescribeRegionResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionResourceResponse self = new DescribeRegionResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRegionResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRegionResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRegionResourceResponse setBody(DescribeRegionResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRegionResourceResponseBody getBody() {
        return this.body;
    }

}
