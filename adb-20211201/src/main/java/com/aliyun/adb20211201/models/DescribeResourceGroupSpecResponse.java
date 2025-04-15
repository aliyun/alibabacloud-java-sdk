// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeResourceGroupSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceGroupSpecResponseBody body;

    public static DescribeResourceGroupSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceGroupSpecResponse self = new DescribeResourceGroupSpecResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceGroupSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceGroupSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceGroupSpecResponse setBody(DescribeResourceGroupSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceGroupSpecResponseBody getBody() {
        return this.body;
    }

}
