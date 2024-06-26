// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainCreateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockchainCreateTaskResponseBody body;

    public static DescribeBlockchainCreateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainCreateTaskResponse self = new DescribeBlockchainCreateTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainCreateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockchainCreateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockchainCreateTaskResponse setBody(DescribeBlockchainCreateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockchainCreateTaskResponseBody getBody() {
        return this.body;
    }

}
