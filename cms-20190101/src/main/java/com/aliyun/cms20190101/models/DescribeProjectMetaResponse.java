// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeProjectMetaResponseBody body;

    public static DescribeProjectMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaResponse self = new DescribeProjectMetaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectMetaResponse setBody(DescribeProjectMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectMetaResponseBody getBody() {
        return this.body;
    }

}
