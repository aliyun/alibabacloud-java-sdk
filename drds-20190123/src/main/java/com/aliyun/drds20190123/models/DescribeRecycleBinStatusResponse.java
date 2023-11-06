// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRecycleBinStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecycleBinStatusResponseBody body;

    public static DescribeRecycleBinStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecycleBinStatusResponse self = new DescribeRecycleBinStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecycleBinStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecycleBinStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRecycleBinStatusResponse setBody(DescribeRecycleBinStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecycleBinStatusResponseBody getBody() {
        return this.body;
    }

}
