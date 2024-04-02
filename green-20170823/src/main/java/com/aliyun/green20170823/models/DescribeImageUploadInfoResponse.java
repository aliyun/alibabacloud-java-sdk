// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeImageUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageUploadInfoResponseBody body;

    public static DescribeImageUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageUploadInfoResponse self = new DescribeImageUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageUploadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageUploadInfoResponse setBody(DescribeImageUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageUploadInfoResponseBody getBody() {
        return this.body;
    }

}
