// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeLoginLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLoginLogsResponseBody body;

    public static DescribeLoginLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginLogsResponse self = new DescribeLoginLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLoginLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLoginLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLoginLogsResponse setBody(DescribeLoginLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLoginLogsResponseBody getBody() {
        return this.body;
    }

}
