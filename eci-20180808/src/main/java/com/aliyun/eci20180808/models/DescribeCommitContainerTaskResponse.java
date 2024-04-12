// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeCommitContainerTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCommitContainerTaskResponseBody body;

    public static DescribeCommitContainerTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommitContainerTaskResponse self = new DescribeCommitContainerTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommitContainerTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommitContainerTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommitContainerTaskResponse setBody(DescribeCommitContainerTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommitContainerTaskResponseBody getBody() {
        return this.body;
    }

}
