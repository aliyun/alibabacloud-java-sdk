// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlayDetailResponseBody body;

    public static DescribePlayDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayDetailResponse self = new DescribePlayDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayDetailResponse setBody(DescribePlayDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayDetailResponseBody getBody() {
        return this.body;
    }

}
