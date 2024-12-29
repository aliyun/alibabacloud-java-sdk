// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsDatasourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsDatasourcesResponseBody body;

    public static DescribeApsDatasourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsDatasourcesResponse self = new DescribeApsDatasourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsDatasourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsDatasourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsDatasourcesResponse setBody(DescribeApsDatasourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsDatasourcesResponseBody getBody() {
        return this.body;
    }

}
