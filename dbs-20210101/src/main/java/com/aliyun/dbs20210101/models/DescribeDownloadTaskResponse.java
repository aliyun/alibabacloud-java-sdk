// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadTaskResponseBody body;

    public static DescribeDownloadTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadTaskResponse self = new DescribeDownloadTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadTaskResponse setBody(DescribeDownloadTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadTaskResponseBody getBody() {
        return this.body;
    }

}
