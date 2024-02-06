// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDownloadURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataDownloadURLResponseBody body;

    public static DescribeDataDownloadURLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDownloadURLResponse self = new DescribeDataDownloadURLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataDownloadURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataDownloadURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataDownloadURLResponse setBody(DescribeDataDownloadURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataDownloadURLResponseBody getBody() {
        return this.body;
    }

}
