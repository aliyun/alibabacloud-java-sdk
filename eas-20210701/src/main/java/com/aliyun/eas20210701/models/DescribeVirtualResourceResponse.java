// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeVirtualResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVirtualResourceResponseBody body;

    public static DescribeVirtualResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualResourceResponse self = new DescribeVirtualResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVirtualResourceResponse setBody(DescribeVirtualResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualResourceResponseBody getBody() {
        return this.body;
    }

}
