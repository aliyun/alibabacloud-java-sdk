// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVerifyRecordsResponseBody body;

    public static DescribeVerifyRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyRecordsResponse self = new DescribeVerifyRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVerifyRecordsResponse setBody(DescribeVerifyRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVerifyRecordsResponseBody getBody() {
        return this.body;
    }

}
