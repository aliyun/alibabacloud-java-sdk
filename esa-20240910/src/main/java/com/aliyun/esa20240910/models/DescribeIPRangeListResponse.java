// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeIPRangeListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIPRangeListResponseBody body;

    public static DescribeIPRangeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPRangeListResponse self = new DescribeIPRangeListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIPRangeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIPRangeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIPRangeListResponse setBody(DescribeIPRangeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIPRangeListResponseBody getBody() {
        return this.body;
    }

}
