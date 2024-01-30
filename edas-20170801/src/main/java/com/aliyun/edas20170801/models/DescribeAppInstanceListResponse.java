// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeAppInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppInstanceListResponseBody body;

    public static DescribeAppInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInstanceListResponse self = new DescribeAppInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppInstanceListResponse setBody(DescribeAppInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppInstanceListResponseBody getBody() {
        return this.body;
    }

}
