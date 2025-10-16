// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkInstanceRelationListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkInstanceRelationListResponseBody body;

    public static DescribeNetworkInstanceRelationListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInstanceRelationListResponse self = new DescribeNetworkInstanceRelationListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInstanceRelationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkInstanceRelationListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkInstanceRelationListResponse setBody(DescribeNetworkInstanceRelationListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkInstanceRelationListResponseBody getBody() {
        return this.body;
    }

}
