// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppsResponseBody body;

    public static DescribeAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponse self = new DescribeAppsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppsResponse setBody(DescribeAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppsResponseBody getBody() {
        return this.body;
    }

}
