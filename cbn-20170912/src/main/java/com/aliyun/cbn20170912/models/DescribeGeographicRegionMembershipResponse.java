// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGeographicRegionMembershipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeGeographicRegionMembershipResponse setBody(DescribeGeographicRegionMembershipResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGeographicRegionMembershipResponseBody getBody() {
        return this.body;
    }

}
