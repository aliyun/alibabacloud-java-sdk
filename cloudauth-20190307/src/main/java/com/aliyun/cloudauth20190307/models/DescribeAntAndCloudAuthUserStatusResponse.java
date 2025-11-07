// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAntAndCloudAuthUserStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAntAndCloudAuthUserStatusResponseBody body;

    public static DescribeAntAndCloudAuthUserStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntAndCloudAuthUserStatusResponse self = new DescribeAntAndCloudAuthUserStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAntAndCloudAuthUserStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAntAndCloudAuthUserStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAntAndCloudAuthUserStatusResponse setBody(DescribeAntAndCloudAuthUserStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAntAndCloudAuthUserStatusResponseBody getBody() {
        return this.body;
    }

}
