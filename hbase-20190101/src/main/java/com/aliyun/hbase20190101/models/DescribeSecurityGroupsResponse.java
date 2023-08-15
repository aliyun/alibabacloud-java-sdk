// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityGroupsResponseBody body;

    public static DescribeSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityGroupsResponse self = new DescribeSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityGroupsResponse setBody(DescribeSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
