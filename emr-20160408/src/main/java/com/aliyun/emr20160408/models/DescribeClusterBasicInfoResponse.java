// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeClusterBasicInfoResponseBody body;

    public static DescribeClusterBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBasicInfoResponse self = new DescribeClusterBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterBasicInfoResponse setBody(DescribeClusterBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterBasicInfoResponseBody getBody() {
        return this.body;
    }

}
