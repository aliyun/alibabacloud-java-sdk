// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchAzoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceSwitchAzoneResponseBody body;

    public static DescribeInstanceSwitchAzoneResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchAzoneResponse self = new DescribeInstanceSwitchAzoneResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchAzoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceSwitchAzoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceSwitchAzoneResponse setBody(DescribeInstanceSwitchAzoneResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceSwitchAzoneResponseBody getBody() {
        return this.body;
    }

}
