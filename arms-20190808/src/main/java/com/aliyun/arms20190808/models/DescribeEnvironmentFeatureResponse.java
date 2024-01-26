// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvironmentFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEnvironmentFeatureResponseBody body;

    public static DescribeEnvironmentFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvironmentFeatureResponse self = new DescribeEnvironmentFeatureResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnvironmentFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEnvironmentFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEnvironmentFeatureResponse setBody(DescribeEnvironmentFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEnvironmentFeatureResponseBody getBody() {
        return this.body;
    }

}
