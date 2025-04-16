// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePortRangeListAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortRangeListAssociationsResponseBody body;

    public static DescribePortRangeListAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortRangeListAssociationsResponse self = new DescribePortRangeListAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortRangeListAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortRangeListAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortRangeListAssociationsResponse setBody(DescribePortRangeListAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortRangeListAssociationsResponseBody getBody() {
        return this.body;
    }

}
