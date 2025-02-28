// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssInfoResponseBody body;

    public static DescribeOssInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssInfoResponse self = new DescribeOssInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssInfoResponse setBody(DescribeOssInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssInfoResponseBody getBody() {
        return this.body;
    }

}
