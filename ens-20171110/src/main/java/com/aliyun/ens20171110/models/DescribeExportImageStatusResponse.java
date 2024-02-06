// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeExportImageStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExportImageStatusResponseBody body;

    public static DescribeExportImageStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportImageStatusResponse self = new DescribeExportImageStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportImageStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExportImageStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExportImageStatusResponse setBody(DescribeExportImageStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExportImageStatusResponseBody getBody() {
        return this.body;
    }

}
