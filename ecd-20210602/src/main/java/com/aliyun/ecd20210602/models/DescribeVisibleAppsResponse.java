// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeVisibleAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVisibleAppsResponseBody body;

    public static DescribeVisibleAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVisibleAppsResponse self = new DescribeVisibleAppsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVisibleAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVisibleAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVisibleAppsResponse setBody(DescribeVisibleAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVisibleAppsResponseBody getBody() {
        return this.body;
    }

}
