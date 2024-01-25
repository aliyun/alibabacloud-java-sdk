// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeModelsResponseBody body;

    public static DescribeModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelsResponse self = new DescribeModelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeModelsResponse setBody(DescribeModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeModelsResponseBody getBody() {
        return this.body;
    }

}
