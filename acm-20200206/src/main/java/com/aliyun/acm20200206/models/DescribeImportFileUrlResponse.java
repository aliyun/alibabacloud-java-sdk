// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeImportFileUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImportFileUrlResponseBody body;

    public static DescribeImportFileUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImportFileUrlResponse self = new DescribeImportFileUrlResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImportFileUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImportFileUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImportFileUrlResponse setBody(DescribeImportFileUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImportFileUrlResponseBody getBody() {
        return this.body;
    }

}
