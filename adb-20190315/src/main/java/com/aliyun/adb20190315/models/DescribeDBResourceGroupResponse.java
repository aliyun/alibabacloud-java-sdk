// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDBResourceGroupResponseBody body;

    public static DescribeDBResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupResponse self = new DescribeDBResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBResourceGroupResponse setBody(DescribeDBResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBResourceGroupResponseBody getBody() {
        return this.body;
    }

}
