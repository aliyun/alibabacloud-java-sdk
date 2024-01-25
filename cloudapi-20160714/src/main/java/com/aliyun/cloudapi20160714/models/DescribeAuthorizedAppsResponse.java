// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAuthorizedAppsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAuthorizedAppsResponseBody body;

    public static DescribeAuthorizedAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthorizedAppsResponse self = new DescribeAuthorizedAppsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAuthorizedAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAuthorizedAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAuthorizedAppsResponse setBody(DescribeAuthorizedAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAuthorizedAppsResponseBody getBody() {
        return this.body;
    }

}
