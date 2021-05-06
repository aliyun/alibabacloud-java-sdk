// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeConnectionCountRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeConnectionCountRecordsResponseBody body;

    public static DescribeConnectionCountRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectionCountRecordsResponse self = new DescribeConnectionCountRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeConnectionCountRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeConnectionCountRecordsResponse setBody(DescribeConnectionCountRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeConnectionCountRecordsResponseBody getBody() {
        return this.body;
    }

}
