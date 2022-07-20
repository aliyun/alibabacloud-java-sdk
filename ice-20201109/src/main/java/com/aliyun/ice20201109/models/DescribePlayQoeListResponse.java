// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayQoeListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlayQoeListResponseBody body;

    public static DescribePlayQoeListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayQoeListResponse self = new DescribePlayQoeListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayQoeListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayQoeListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayQoeListResponse setBody(DescribePlayQoeListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayQoeListResponseBody getBody() {
        return this.body;
    }

}
