// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssResultItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssResultItemsResponseBody body;

    public static DescribeOssResultItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssResultItemsResponse self = new DescribeOssResultItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssResultItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssResultItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssResultItemsResponse setBody(DescribeOssResultItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssResultItemsResponseBody getBody() {
        return this.body;
    }

}
