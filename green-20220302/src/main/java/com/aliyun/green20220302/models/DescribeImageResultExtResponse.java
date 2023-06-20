// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeImageResultExtResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
