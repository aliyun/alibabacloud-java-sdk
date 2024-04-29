// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadSupportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDownloadSupportResponseBody body;

    public static DescribeDownloadSupportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadSupportResponse self = new DescribeDownloadSupportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadSupportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadSupportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadSupportResponse setBody(DescribeDownloadSupportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadSupportResponseBody getBody() {
        return this.body;
    }

}
