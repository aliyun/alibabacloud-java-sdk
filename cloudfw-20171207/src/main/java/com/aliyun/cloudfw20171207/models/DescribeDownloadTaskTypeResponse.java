// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadTaskTypeResponseBody body;

    public static DescribeDownloadTaskTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadTaskTypeResponse self = new DescribeDownloadTaskTypeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadTaskTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadTaskTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadTaskTypeResponse setBody(DescribeDownloadTaskTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadTaskTypeResponseBody getBody() {
        return this.body;
    }

}
