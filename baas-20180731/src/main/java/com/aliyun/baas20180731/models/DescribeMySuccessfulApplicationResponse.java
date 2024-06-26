// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMySuccessfulApplicationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMySuccessfulApplicationResponseBody body;

    public static DescribeMySuccessfulApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMySuccessfulApplicationResponse self = new DescribeMySuccessfulApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMySuccessfulApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMySuccessfulApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMySuccessfulApplicationResponse setBody(DescribeMySuccessfulApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMySuccessfulApplicationResponseBody getBody() {
        return this.body;
    }

}
