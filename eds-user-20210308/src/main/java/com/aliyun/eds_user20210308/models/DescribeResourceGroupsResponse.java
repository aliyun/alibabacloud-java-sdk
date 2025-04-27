// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeResourceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceGroupsResponseBody body;

    public static DescribeResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceGroupsResponse self = new DescribeResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceGroupsResponse setBody(DescribeResourceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceGroupsResponseBody getBody() {
        return this.body;
    }

}
