// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeDataSourceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataSourceInstanceResponseBody body;

    public static DescribeDataSourceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataSourceInstanceResponse self = new DescribeDataSourceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataSourceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataSourceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataSourceInstanceResponse setBody(DescribeDataSourceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataSourceInstanceResponseBody getBody() {
        return this.body;
    }

}
