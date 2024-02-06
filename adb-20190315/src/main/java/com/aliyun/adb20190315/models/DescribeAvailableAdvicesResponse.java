// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeAvailableAdvicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableAdvicesResponseBody body;

    public static DescribeAvailableAdvicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableAdvicesResponse self = new DescribeAvailableAdvicesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableAdvicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableAdvicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableAdvicesResponse setBody(DescribeAvailableAdvicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableAdvicesResponseBody getBody() {
        return this.body;
    }

}
