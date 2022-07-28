// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribePreCheckProgressListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePreCheckProgressListResponseBody body;

    public static DescribePreCheckProgressListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckProgressListResponse self = new DescribePreCheckProgressListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckProgressListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePreCheckProgressListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePreCheckProgressListResponse setBody(DescribePreCheckProgressListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePreCheckProgressListResponseBody getBody() {
        return this.body;
    }

}
