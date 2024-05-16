// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribePatternTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePatternTypesResponseBody body;

    public static DescribePatternTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePatternTypesResponse self = new DescribePatternTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePatternTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePatternTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePatternTypesResponse setBody(DescribePatternTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePatternTypesResponseBody getBody() {
        return this.body;
    }

}
