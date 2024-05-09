// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBResourceManagementModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBResourceManagementModeResponseBody body;

    public static DescribeDBResourceManagementModeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceManagementModeResponse self = new DescribeDBResourceManagementModeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceManagementModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBResourceManagementModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBResourceManagementModeResponse setBody(DescribeDBResourceManagementModeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBResourceManagementModeResponseBody getBody() {
        return this.body;
    }

}
