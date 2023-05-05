// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class DescribeAppDownloadInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppDownloadInfoResponseBody body;

    public static DescribeAppDownloadInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDownloadInfoResponse self = new DescribeAppDownloadInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppDownloadInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppDownloadInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppDownloadInfoResponse setBody(DescribeAppDownloadInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppDownloadInfoResponseBody getBody() {
        return this.body;
    }

}
