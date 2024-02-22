// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobStatusResponseBody body;

    public static DescribeJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobStatusResponse self = new DescribeJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobStatusResponse setBody(DescribeJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobStatusResponseBody getBody() {
        return this.body;
    }

}
