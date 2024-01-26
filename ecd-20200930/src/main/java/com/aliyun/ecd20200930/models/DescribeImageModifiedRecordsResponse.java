// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImageModifiedRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageModifiedRecordsResponseBody body;

    public static DescribeImageModifiedRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageModifiedRecordsResponse self = new DescribeImageModifiedRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageModifiedRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageModifiedRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageModifiedRecordsResponse setBody(DescribeImageModifiedRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageModifiedRecordsResponseBody getBody() {
        return this.body;
    }

}
