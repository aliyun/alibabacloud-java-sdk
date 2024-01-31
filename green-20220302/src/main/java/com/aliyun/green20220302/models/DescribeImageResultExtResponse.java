// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeImageResultExtResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageResultExtResponseBody body;

    public static DescribeImageResultExtResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageResultExtResponse self = new DescribeImageResultExtResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageResultExtResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageResultExtResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageResultExtResponse setBody(DescribeImageResultExtResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageResultExtResponseBody getBody() {
        return this.body;
    }

}
