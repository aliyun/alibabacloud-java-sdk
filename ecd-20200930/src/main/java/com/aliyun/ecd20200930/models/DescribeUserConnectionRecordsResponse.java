// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeUserConnectionRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeUserConnectionRecordsResponseBody body;

    public static DescribeUserConnectionRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConnectionRecordsResponse self = new DescribeUserConnectionRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserConnectionRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserConnectionRecordsResponse setBody(DescribeUserConnectionRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserConnectionRecordsResponseBody getBody() {
        return this.body;
    }

}
