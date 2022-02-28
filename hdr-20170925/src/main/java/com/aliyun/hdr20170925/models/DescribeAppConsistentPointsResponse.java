// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAppConsistentPointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAppConsistentPointsResponseBody body;

    public static DescribeAppConsistentPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppConsistentPointsResponse self = new DescribeAppConsistentPointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppConsistentPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppConsistentPointsResponse setBody(DescribeAppConsistentPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppConsistentPointsResponseBody getBody() {
        return this.body;
    }

}
