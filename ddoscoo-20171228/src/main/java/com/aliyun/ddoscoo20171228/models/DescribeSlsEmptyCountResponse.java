// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeSlsEmptyCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSlsEmptyCountResponseBody body;

    public static DescribeSlsEmptyCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsEmptyCountResponse self = new DescribeSlsEmptyCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsEmptyCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsEmptyCountResponse setBody(DescribeSlsEmptyCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsEmptyCountResponseBody getBody() {
        return this.body;
    }

}
