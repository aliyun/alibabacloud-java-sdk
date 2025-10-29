// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeSDGSharedDisksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSDGSharedDisksResponseBody body;

    public static DescribeSDGSharedDisksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDGSharedDisksResponse self = new DescribeSDGSharedDisksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDGSharedDisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDGSharedDisksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSDGSharedDisksResponse setBody(DescribeSDGSharedDisksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDGSharedDisksResponseBody getBody() {
        return this.body;
    }

}
