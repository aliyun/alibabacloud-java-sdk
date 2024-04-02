// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUploadInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUploadInfoResponseBody body;

    public static DescribeUploadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUploadInfoResponse self = new DescribeUploadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUploadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUploadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUploadInfoResponse setBody(DescribeUploadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUploadInfoResponseBody getBody() {
        return this.body;
    }

}
