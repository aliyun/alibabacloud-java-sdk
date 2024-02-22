// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeExporterOutputListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExporterOutputListResponseBody body;

    public static DescribeExporterOutputListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExporterOutputListResponse self = new DescribeExporterOutputListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExporterOutputListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExporterOutputListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExporterOutputListResponse setBody(DescribeExporterOutputListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExporterOutputListResponseBody getBody() {
        return this.body;
    }

}
