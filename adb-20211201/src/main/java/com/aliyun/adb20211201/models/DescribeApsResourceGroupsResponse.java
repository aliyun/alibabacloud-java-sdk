// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsResourceGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsResourceGroupsResponseBody body;

    public static DescribeApsResourceGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsResourceGroupsResponse self = new DescribeApsResourceGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsResourceGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsResourceGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsResourceGroupsResponse setBody(DescribeApsResourceGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsResourceGroupsResponseBody getBody() {
        return this.body;
    }

}
