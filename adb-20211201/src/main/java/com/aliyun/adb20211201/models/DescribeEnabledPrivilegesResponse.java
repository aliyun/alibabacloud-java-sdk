// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeEnabledPrivilegesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnabledPrivilegesResponseBody body;

    public static DescribeEnabledPrivilegesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnabledPrivilegesResponse self = new DescribeEnabledPrivilegesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnabledPrivilegesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnabledPrivilegesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnabledPrivilegesResponse setBody(DescribeEnabledPrivilegesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnabledPrivilegesResponseBody getBody() {
        return this.body;
    }

}
