// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DescribeOssV2ResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOssV2ResultResponseBody body;

    public static DescribeOssV2ResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssV2ResultResponse self = new DescribeOssV2ResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOssV2ResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOssV2ResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOssV2ResultResponse setBody(DescribeOssV2ResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOssV2ResultResponseBody getBody() {
        return this.body;
    }

}
