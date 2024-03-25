// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGeographicRegionMembershipResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGeographicRegionMembershipResponseBody body;

    public static DescribeGeographicRegionMembershipResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeographicRegionMembershipResponse self = new DescribeGeographicRegionMembershipResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGeographicRegionMembershipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGeographicRegionMembershipResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGeographicRegionMembershipResponse setBody(DescribeGeographicRegionMembershipResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGeographicRegionMembershipResponseBody getBody() {
        return this.body;
    }

}
