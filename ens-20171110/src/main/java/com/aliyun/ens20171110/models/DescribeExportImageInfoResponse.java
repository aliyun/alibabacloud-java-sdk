// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExportImageInfoResponseBody body;

    public static DescribeExportImageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportImageInfoResponse self = new DescribeExportImageInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportImageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExportImageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExportImageInfoResponse setBody(DescribeExportImageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExportImageInfoResponseBody getBody() {
        return this.body;
    }

}
