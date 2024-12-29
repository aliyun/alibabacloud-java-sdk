// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsDatasourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsDatasourceResponseBody body;

    public static DescribeApsDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsDatasourceResponse self = new DescribeApsDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsDatasourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsDatasourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsDatasourceResponse setBody(DescribeApsDatasourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsDatasourceResponseBody getBody() {
        return this.body;
    }

}
