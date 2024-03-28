// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeWebHostingFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebHostingFileResponseBody body;

    public static DescribeWebHostingFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebHostingFileResponse self = new DescribeWebHostingFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebHostingFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebHostingFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebHostingFileResponse setBody(DescribeWebHostingFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebHostingFileResponseBody getBody() {
        return this.body;
    }

}
