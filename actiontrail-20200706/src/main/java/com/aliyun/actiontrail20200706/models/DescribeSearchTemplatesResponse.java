// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeSearchTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSearchTemplatesResponseBody body;

    public static DescribeSearchTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchTemplatesResponse self = new DescribeSearchTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSearchTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSearchTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSearchTemplatesResponse setBody(DescribeSearchTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSearchTemplatesResponseBody getBody() {
        return this.body;
    }

}
