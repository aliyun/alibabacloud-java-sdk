// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortConnsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePortConnsListResponseBody body;

    public static DescribePortConnsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePortConnsListResponse self = new DescribePortConnsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePortConnsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePortConnsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePortConnsListResponse setBody(DescribePortConnsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePortConnsListResponseBody getBody() {
        return this.body;
    }

}
