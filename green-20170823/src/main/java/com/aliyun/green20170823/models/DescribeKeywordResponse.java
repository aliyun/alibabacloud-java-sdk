// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeKeywordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKeywordResponseBody body;

    public static DescribeKeywordResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeywordResponse self = new DescribeKeywordResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeywordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKeywordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKeywordResponse setBody(DescribeKeywordResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKeywordResponseBody getBody() {
        return this.body;
    }

}
