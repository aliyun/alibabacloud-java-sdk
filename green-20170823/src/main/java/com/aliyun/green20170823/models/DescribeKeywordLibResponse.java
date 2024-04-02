// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeKeywordLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKeywordLibResponseBody body;

    public static DescribeKeywordLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeywordLibResponse self = new DescribeKeywordLibResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKeywordLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKeywordLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKeywordLibResponse setBody(DescribeKeywordLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKeywordLibResponseBody getBody() {
        return this.body;
    }

}
