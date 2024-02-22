// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceStatusResponseBody body;

    public static DescribeServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceStatusResponse self = new DescribeServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceStatusResponse setBody(DescribeServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceStatusResponseBody getBody() {
        return this.body;
    }

}
