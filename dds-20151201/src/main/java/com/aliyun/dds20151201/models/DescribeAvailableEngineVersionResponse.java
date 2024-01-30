// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeAvailableEngineVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableEngineVersionResponseBody body;

    public static DescribeAvailableEngineVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableEngineVersionResponse self = new DescribeAvailableEngineVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableEngineVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableEngineVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableEngineVersionResponse setBody(DescribeAvailableEngineVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableEngineVersionResponseBody getBody() {
        return this.body;
    }

}
