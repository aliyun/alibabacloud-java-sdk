// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlayListResponseBody body;

    public static DescribePlayListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayListResponse self = new DescribePlayListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayListResponse setBody(DescribePlayListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayListResponseBody getBody() {
        return this.body;
    }

}
