// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceZoneListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAccessInstanceZoneListResponseBody body;

    public static DescribeAccessInstanceZoneListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceZoneListResponse self = new DescribeAccessInstanceZoneListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceZoneListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccessInstanceZoneListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAccessInstanceZoneListResponse setBody(DescribeAccessInstanceZoneListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccessInstanceZoneListResponseBody getBody() {
        return this.body;
    }

}
