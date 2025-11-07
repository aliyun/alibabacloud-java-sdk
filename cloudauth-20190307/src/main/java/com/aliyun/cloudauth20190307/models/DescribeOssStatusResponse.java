// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeOssStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssStatusResponseBody body;

    public static DescribeOssStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssStatusResponse self = new DescribeOssStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssStatusResponse setBody(DescribeOssStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssStatusResponseBody getBody() {
        return this.body;
    }

}
