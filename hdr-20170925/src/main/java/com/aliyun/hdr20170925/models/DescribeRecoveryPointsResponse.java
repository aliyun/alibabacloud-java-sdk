// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRecoveryPointsResponseBody body;

    public static DescribeRecoveryPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPointsResponse self = new DescribeRecoveryPointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRecoveryPointsResponse setBody(DescribeRecoveryPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRecoveryPointsResponseBody getBody() {
        return this.body;
    }

}
