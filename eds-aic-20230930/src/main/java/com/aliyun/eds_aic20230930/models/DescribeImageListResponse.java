// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeImageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageListResponseBody body;

    public static DescribeImageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListResponse self = new DescribeImageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageListResponse setBody(DescribeImageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageListResponseBody getBody() {
        return this.body;
    }

}
