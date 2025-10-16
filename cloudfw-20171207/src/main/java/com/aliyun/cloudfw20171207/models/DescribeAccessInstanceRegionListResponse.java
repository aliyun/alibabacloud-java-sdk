// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceRegionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessInstanceRegionListResponseBody body;

    public static DescribeAccessInstanceRegionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceRegionListResponse self = new DescribeAccessInstanceRegionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceRegionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessInstanceRegionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessInstanceRegionListResponse setBody(DescribeAccessInstanceRegionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessInstanceRegionListResponseBody getBody() {
        return this.body;
    }

}
