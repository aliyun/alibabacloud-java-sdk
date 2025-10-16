// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceVpcListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessInstanceVpcListResponseBody body;

    public static DescribeAccessInstanceVpcListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceVpcListResponse self = new DescribeAccessInstanceVpcListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceVpcListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessInstanceVpcListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessInstanceVpcListResponse setBody(DescribeAccessInstanceVpcListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessInstanceVpcListResponseBody getBody() {
        return this.body;
    }

}
