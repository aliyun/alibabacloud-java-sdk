// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAclAppsResponseBody body;

    public static DescribeAclAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclAppsResponse self = new DescribeAclAppsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAclAppsResponse setBody(DescribeAclAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclAppsResponseBody getBody() {
        return this.body;
    }

}
