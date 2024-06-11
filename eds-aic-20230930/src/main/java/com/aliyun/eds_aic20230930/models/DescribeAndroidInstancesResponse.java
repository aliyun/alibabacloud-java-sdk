// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeAndroidInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAndroidInstancesResponseBody body;

    public static DescribeAndroidInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAndroidInstancesResponse self = new DescribeAndroidInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAndroidInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAndroidInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAndroidInstancesResponse setBody(DescribeAndroidInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAndroidInstancesResponseBody getBody() {
        return this.body;
    }

}
