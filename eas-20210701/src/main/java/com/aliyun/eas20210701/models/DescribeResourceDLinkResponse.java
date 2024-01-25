// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceDLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceDLinkResponseBody body;

    public static DescribeResourceDLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDLinkResponse self = new DescribeResourceDLinkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceDLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceDLinkResponse setBody(DescribeResourceDLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceDLinkResponseBody getBody() {
        return this.body;
    }

}
